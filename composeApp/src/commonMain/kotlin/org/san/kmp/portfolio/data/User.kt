package org.san.kmp.portfolio.data

data class User(
    val name: String,
    val description: String,
    val imageLink: String,
    val resumeLink: String
) {

    companion object {
        fun getSampleData() = listOf(
            User(
                name = "San SK",
                description = "Innovative Android Developer with 5 years of experience building high-quality, scalable apps across health, e-commerce, and listing platforms. Proficient in Kotlin, Java, and the Android SDK, I have developed and launched 2 apps from scratch. Notably, I played a key role in optimizing an app with 10M downloads, improving performance, startup time, and user engagement.",
                imageLink = "",
                resumeLink = ""
            )
        )
    }
}
