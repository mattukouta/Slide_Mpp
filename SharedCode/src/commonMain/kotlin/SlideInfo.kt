import Slide.SubContent
import Slide.SubContent.SubSubContent

class SlideInfo {
    companion object {
        private val page1 = Slide(
            "cover",
            "開発を楽にするためのStep",
            null,
            null
        )

        private val page2 = Slide(
            "content",
            "自己紹介",
            listOf(
                SubContent(hashMapOf("名前" to listOf(SubSubContent(hashMapOf("高松耕太" to null))))),
                SubContent(hashMapOf("所属" to listOf(
                    SubSubContent(hashMapOf("高度ICT領域 修士1年" to null)),
                    SubSubContent(hashMapOf("奥野研究室" to null)),
                    SubSubContent(hashMapOf("Hakodate Sweets" to null))
                ))),
                SubContent(hashMapOf("趣味" to listOf(
                    SubSubContent(hashMapOf("Androidアプリ開発" to null)),
                    SubSubContent(hashMapOf("野球観戦" to null)),
                    SubSubContent(hashMapOf("動画鑑賞（アニメ，Youtube等）" to null))
                )))
            ),
            null
        )

        private val page3  = Slide(
            "door",
            "開発を楽にするためのStep",
            null,
            null
        )

        private val page4  = Slide(
            "door",
            "CIツールって聞いたことありますか？",
            null,
            null
        )

        private val page5  = Slide(
            "content",
            "CIツールとは",
            listOf(
                SubContent(hashMapOf("CI (Continuous Integrationの略)" to listOf(
                    SubSubContent(hashMapOf("継続的インテグレーション" to null)),
                    SubSubContent(hashMapOf("コード変更のたびに，自動化されたテスト等を実行" to listOf(
                        "Jenkins",
                        "CircleCI",
                        "TravisCI",
                        "Bitrise",
                        "GitHub Actions"
                    )))
                )))
            ),
            null
        )

        private val page6  = Slide(
            "door",
            "自分はHakodate Sweetsに所属してるが..",
            null,
            null
        )

        private val page7  = Slide(
            "content",
            "Android班の現状",
            listOf(
                SubContent(hashMapOf("CIの導入予定はある" to null)),
                SubContent(hashMapOf("テスト書いてない" to null)),
                SubContent(hashMapOf("実行するのが，ktlintのみになる" to null))
            ),
            null
        )

        val slideInfo = listOf<Slide>(
            page1, page2, page3, page4, page5, page6, page7
        )
    }
}