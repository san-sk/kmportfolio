package org.san.kmp.portfolio.data

import androidx.compose.ui.graphics.Color

data class Work(
    val name: String,
    val description: String,
    val role: String,
    val date: String,
    val link: String,
    val colorCodes: List<Color>
) {

    companion object {
        fun getSampleData() = listOf(
            Work(
                name = "Temenos",
                description = "Temenos Core for Payments. Through configurable functionality",
                link = "https://seeklogo.com/images/T/temenos-logo-ED09BFE118-seeklogo.com.png",
                date = "06/2023 - 12/2024",
                role = "Engineer",
                colorCodes = listOf(Color(0xff36458a), Color(0xffd2ce04))
            ),
            Work(
                name = "Netmeds",
                description = "Netmeds is India's one of the largest and most trusted online pharmacy.",
                link = "https://seeklogo.com/images/N/netmeds-logo-4A3580CB35-seeklogo.com.png",
                date = "11/2022 - 05/2023",
                role = "Senior Software Engineer",
                colorCodes = listOf(Color(0xff5bbbc3), Color(0xff9cce65))
            ),
            Work(
                name = "Global Logic",
                description = "GlobalLogic digital product engineering companies that offers product consulting and software engineering partner services.",
                link = "https://seeklogo.com/images/G/global-logic-logo-2A1079EB9D-seeklogo.com.png",
                date = "06/2022 - 10/2022",
                role = "Software Engineer",
                colorCodes = listOf(Color(0xfffefffd), Color(0xfff37334))
            ),
            Work(
                name = "Sulekha",
                description = "Sulekha is the best option for small business owners to get genuine leads and grow their business into a brand.",
                link = "https://cdn6.aptoide.com/imgs/f/0/f/f0ff3c0a953e7af98f25da6dd6fc55e6_fgraphic.png",
                date = "01/2021 - 06/2022",
                role = "Software Developer",
                colorCodes = listOf(Color(0xffdc000a), Color(0xffffb400))
            ),
            Work(
                name = "VASS",
                description = "Single window solution for complete Hospital Information Management. OP (Out Patient); IP (In Patient); Tele Medicine; HR & Payroll.",
                link = "https://media.licdn.com/dms/image/v2/C560BAQF3ZO5HSEpsCQ/company-logo_200_200/company-logo_200_200/0/1630618720910/vass_softwares__solutions_private_limited_logo?e=2147483647&v=beta&t=cyllJKBc7SRe8TOqVcvihYKvj1eZWTpyoYMYEMdtkXo",
                date = "09/2019 - 12/2020",
                role = "Android Developer",
                colorCodes = listOf(Color(0xff5bbbc3), Color(0xff9cce65))
            ),

        )
    }
}
