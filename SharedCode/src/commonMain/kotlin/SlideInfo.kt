import Slide.SubContent
import Slide.SubContent.SubSubContent

class SlideInfo {
    companion object {
        private val page1 = Slide(
            "cover",
            "Kotlinで始めるクロスプラットフォーム開発",
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
                    SubSubContent(hashMapOf("はこだてSweets" to null))
                ))),
                SubContent(hashMapOf("趣味" to listOf(
                    SubSubContent(hashMapOf("Androidアプリ開発" to null)),
                    SubSubContent(hashMapOf("野球観戦" to null)),
                    SubSubContent(hashMapOf("動画鑑賞（アニメ，Youtube等）" to null))
                )))
            ),
            "myImage.png"
        )

        private val page3  = Slide(
            "door",
            "Kotlinで始めるクロスプラットフォーム開発",
            null,
            null
        )

        private val page4  = Slide(
            "content",
            "クロスプラットフォーム開発とは",
            listOf(
                SubContent(hashMapOf("クロスプラットフォーム開発" to listOf(
                    SubSubContent(hashMapOf("複数のプラットフォームで動作するアプリケーションの開発" to null)),
                    SubSubContent(hashMapOf("開発環境がいくつか存在" to listOf(
                        "Xamarin",
                        "Flutter",
                        "React Native",
                        "Unityなど")))
                )))
            ),
            null
        )

        private val page5  = Slide(
            "door",
            "Kotlin/Native, Kotlin MPP",
            null,
            null
        )

        private val page6  = Slide(
            "content",
            "Kotlin/Native, Kotlin MPPとは",
            listOf(
                SubContent(hashMapOf("Kotlin/Native, Kotlin MPP" to listOf(
                    SubSubContent(hashMapOf("Kotlinを用いてクロスプラットフォーム開発を行うプロジェクト" to null)),
                    SubSubContent(hashMapOf("共通化する部分をライブラリとして実装" to listOf(
                        "レイアウトは各プラットフォームで実装"
                    )))
                )))
            ),
            null
        )

        private val page7 = Slide(
            "content",
            "実際にアプリを作ってみた",
            listOf(
                SubContent(hashMapOf("スライド表示アプリ" to listOf(
                    SubSubContent(hashMapOf("共通部分" to listOf(
                        "スライドに表示させるテキスト",
                        "Twitter API取得"
                    ))),
                    SubSubContent(hashMapOf("Androidのレイアウト" to listOf(
                        "XML"
                    )
                    )),
                    SubSubContent(hashMapOf("iOSのレイアウト" to listOf(
                        "SwiftUI"
                    )))
                )))
            ),
            null
        )

        private val page8  = Slide(
            "content",
            "個人的なメリット",
            listOf(
                SubContent(hashMapOf("慣れている言語（Kotlin）で記述できる" to null)),
                SubContent(hashMapOf("あらたな言語を覚える必要がない" to null))
            ),
            null
        )

        private val page9  = Slide(
            "content",
            "個人的なデメリット",
            listOf(
                SubContent(hashMapOf("Kotlin記述のライブラリしか使えない" to listOf(
                    SubSubContent(hashMapOf("Javaで記述されているライブラリを使用できない" to null))
                ))),
                SubContent(hashMapOf("Kotlinやライブラリのバージョンに悩まされる" to listOf(
                    SubSubContent(hashMapOf("一部ライブラリで，Kotlin最新バージョン未対応" to null)),
                    SubSubContent(hashMapOf("少し対応が遅めなイメージ" to null))
                ))),
                SubContent(hashMapOf("使用事例が少なく，学習リソースが少ない" to null))
            ),
            null
        )

        private val page10  = Slide(
            "content",
            "参考リソース",
            listOf(
                SubContent(hashMapOf("Kotlin MPP Tutorial" to listOf(
                    SubSubContent(hashMapOf("https://play.kotlinlang.org/hands-on/Targeting%20iOS%20and%20Android%20with%20Kotlin%20Multiplatform/01_Introduction" to null))
                ))),
                SubContent(hashMapOf("DroidKaigiアプリ" to listOf(
                    SubSubContent(hashMapOf("https://github.com/DroidKaigi/conference-app-2020" to null))
                ))),
                SubContent(hashMapOf("Kotlin Confアプリ" to listOf(
                    SubSubContent(hashMapOf("https://github.com/JetBrains/kotlinconf-app" to null))
                )))
            ),
            null
        )

        private val page11  = Slide(
            "door",
            "ご清聴ありがとうございました",
            null,
            null
        )

        val slideInfo = listOf(
            page1, page2, page3, page4, page5, page6, page7, page8, page9, page10, page11
        )
    }
}