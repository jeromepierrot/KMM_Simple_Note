package com.stonwewater.kmmsimplenote

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform