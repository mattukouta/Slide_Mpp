import KeyUtils.Companion.BEARER_TOKEN
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.header
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

internal expect val coroutineDispatcher: CoroutineDispatcher
class ApiClient {
    private val httpClient = HttpClient()
    internal val hashTag: String = "ca_fun_lt"

    @UnstableDefault
    fun getTweets(successCallback: (Tweets) -> Unit, errorCallback: (Exception) -> Unit) {
        GlobalScope.launch(coroutineDispatcher) {
            try {
                val url = "https://api.twitter.com/1.1/search/tweets.json?q=%23${hashTag} -filter:retweets&count=2&result_type=recent&include_entities=false"
                val result = httpClient.get<String>(url){
                    header("Authorization","Bearer $BEARER_TOKEN")
                }
                val tweets = Json(
                    JsonConfiguration(
                        strictMode = false,
                        useArrayPolymorphism = true
                    )
                ).parse(Tweets.serializer(), result)

                successCallback(tweets)
            } catch (e: Exception) {
                errorCallback(e)
            }
        }
    }
}