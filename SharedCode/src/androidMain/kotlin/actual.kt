import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual fun platformName(): String = "Android"

internal actual val coroutineDispatcher: CoroutineDispatcher = Dispatchers.IO