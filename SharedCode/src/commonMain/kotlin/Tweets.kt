import kotlinx.serialization.Serializable

@Serializable
data class Tweets(val statuses: List<Statuses>?, val search_metadata: SearchMetadata?) {
    @Serializable
    data class Statuses(
        val created_at: String?,
        val id_str: String?,
        val text: String?,
        val source: String?,
        val user: User?
    ) {
        @Serializable
        data class User(
            val id_str: String?,
            val name: String?,
            val screen_name: String?,
            val description: String?,
            val url: String?,
            val profile_background_color: String?,
            val profile_background_image_url: String?,
            val profile_background_image_url_https: String?,
            val profile_background_tile: Boolean?,
            val profile_image_url: String?,
            val profile_image_url_https: String?,
            val profile_banner_url: String?,
            val profile_link_color: String?,
            val profile_sidebar_border_color: String?,
            val profile_sidebar_fill_color: String?,
            val profile_text_color: String?
        )
    }

    @Serializable
    data class SearchMetadata(
        val completed_in: Double?,
        val max_id: Long?,
        val max_id_str: String?,
        val next_results: String?,
        val query: String?,
        val refresh_url: String?,
        val count: Int?,
        val since_id: Int?,
        val since_id_str: String?
    )
}