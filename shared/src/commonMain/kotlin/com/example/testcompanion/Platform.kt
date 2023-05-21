package com.example.testcompanion

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform