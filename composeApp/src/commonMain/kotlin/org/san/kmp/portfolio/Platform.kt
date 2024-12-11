package org.san.kmp.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform