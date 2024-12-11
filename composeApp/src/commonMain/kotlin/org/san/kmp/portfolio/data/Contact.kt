package org.san.kmp.portfolio.data



data class Contact(val name: String, val link: String, var icon: String? = null) {
    companion object {


        fun getSampleData() = listOf(
            Contact("Phone", "9444992626", "https://cdn.simpleicons.org/whatsapp"),
            Contact("Email", "sansk.dev@gmail.com", "https://cdn.simpleicons.org/gmail"),
            Contact("Linkedin", "https://www.linkedin.com/in/santhanam-k-0236a91b1/", "https://cdn.simpleicons.org/linkedin"),
            Contact("Github", "https://github.com/santhanam", "https://cdn.simpleicons.org/github")
        )
    }
}
