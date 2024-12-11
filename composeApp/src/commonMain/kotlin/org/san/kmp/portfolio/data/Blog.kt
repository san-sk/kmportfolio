package org.san.kmp.portfolio.data

data class Blog(
    val id: String,
    val title: String,
    val date: String,
    val tags: List<String>,
    val description: String,
    val srcUrl: String
) {
    companion object {
        fun getSampleData() = listOf(
            Blog(
                "1",
                "Jetpack Compose",
                "12 Jul 2023",
                listOf("Jetpack", "Compose"),
                "Jetpack Compose is Android's recommended modern toolkit for building native UI. It simplifies and accelerates UI development on Android.",
                ""
            ),
            Blog(
                "1",
                "Jetpack Compose",
                "12 Jul 2023",
                listOf("Jetpack", "Compose"),
                "Jetpack Compose is Android's recommended modern toolkit for building native UI. It simplifies and accelerates UI development on Android.",
                ""
            ),
            Blog(
                "1",
                "Jetpack Compose",
                "12 Jul 2023",
                listOf("Jetpack", "Compose"),
                "Jetpack Compose is Android's recommended modern toolkit for building native UI. It simplifies and accelerates UI development on Android.",
                ""
            )
        )
    }
}




