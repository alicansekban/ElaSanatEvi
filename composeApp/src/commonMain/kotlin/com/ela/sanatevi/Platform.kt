package com.ela.sanatevi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform