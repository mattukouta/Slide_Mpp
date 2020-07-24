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

    @UnstableDefault
    fun getTweets(successCallback: (Tweets) -> Unit, errorCallback: (Exception) -> Unit) {
        GlobalScope.launch(coroutineDispatcher) {
            try {
                val url = "https://api.twitter.com/1.1/search/tweets.json?q=%23ca_fun_lt&count=2&result_type=recent&include_entities=false"
                val result = httpClient.get<String>(url){
                    header("Authorization","Bearer AAAAAAAAAAAAAAAAAAAAANpkGAEAAAAANOXZxNK680LbU1vtoWaOGo%2BJRmA%3D221IaVZ4TkrzW87H7QxcSvoRW4WAFFMkxAUhcuBAKyjTjCoum3")
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