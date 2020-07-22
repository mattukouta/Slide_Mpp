import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.readText
import io.ktor.http.URLProtocol
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json

internal expect val coroutineDispatcher: CoroutineDispatcher
class ApiClient {
    private val httpClient = HttpClient()

    fun getTweets(successCallback: (Tweets) -> Unit, errorCallback: (Exception) -> Unit) {
        GlobalScope.launch(coroutineDispatcher) {
            try {
                val url = "http://www.json-generator.com/api/json/get/cfUkWOpFiW?indent=2"
                val result = httpClient.get<HttpResponse>{url(url)}.readText()

                val tweets = Json.parse(Tweets.serializer(), result)

                successCallback(tweets)
            } catch (e: Exception) {
                errorCallback(e)
            }
        }
    }
}