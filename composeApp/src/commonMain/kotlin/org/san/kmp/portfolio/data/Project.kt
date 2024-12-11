package org.san.kmp.portfolio.data

import androidx.compose.ui.graphics.Color

data class Project(
    val name: String,
    val description: String,
    val date: String,
    val imageLink: String,
    val workLink: String,
    val tags: List<String>,
    val colorCodes: List<Color>
) {

    companion object {
        fun getSampleData() = listOf(
            Project(
                name = "Temenos",
                description = "Temenos Core for Payments. Through configurable functionality, the Temenos Payments offering can empowers financial institutions to extend and enhance ...",
                imageLink = "https://5.imimg.com/data5/SELLER/Default/2023/10/350051382/TR/PB/ZK/12572893/temenos-banking-software.jpg",
                workLink = "https://play.google.com/store/apps/details?id=com.sulekha.businessapp&hl=en_IN",
                date = "2023",
                tags = listOf("Jetpack", "Compose"),
                colorCodes = listOf(Color(0xff36458a), Color(0xffd2ce04))
            ),
            Project(
                name = "Netmeds",
                description = "Netmeds is India's one of the largest and most trusted online pharmacy that provides quality medicines on prescription, OTC and Wellness products.",
                imageLink = "https://jungleworks.com/wp-content/uploads/2022/04/netmeds-1024x512.jpeg",
                workLink = "https://play.google.com/store/apps/details?id=com.sulekha.businessapp&hl=en_IN",
                date = "2023",
                tags = listOf("Jetpack", "Compose"),
                colorCodes = listOf(Color(0xff5bbbc3), Color(0xff9cce65))
            ),
            Project(
                name = "Sulekha Business App",
                description = "Sulekha is the best option for small business owners to get genuine leads and grow their business into a brand. Sign up today by clicking on the link below. ",
                imageLink = "https://cdn6.aptoide.com/imgs/f/0/f/f0ff3c0a953e7af98f25da6dd6fc55e6_fgraphic.png",
                workLink = "https://play.google.com/store/apps/details?id=com.sulekha.businessapp&hl=en_IN",
                date = "2023",
                tags = listOf("Jetpack", "Compose"),
                colorCodes = listOf(Color(0xffdc000a), Color(0xffffb400))
            ),
        )
    }
}
