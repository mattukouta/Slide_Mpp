data class Slide(
    val SlideType: String,
    val Title: String,
    val subContents: List<SubContent>?,
    val image: String?
) {
    data class SubContent(
        val subContent: HashMap<String, List<SubSubContent>?>
    ) {
        data class SubSubContent(val subSubContent: HashMap<String, List<String>?>)
    }
}