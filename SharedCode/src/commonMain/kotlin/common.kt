import SlideInfo.Companion.slideInfo

expect fun platformName(): String

fun createApplicationScreenMessage(): String =  "Kotlin Rocks on ${platformName()}"

fun getSlideInfo(): List<Slide> = slideInfo