package com.example.salutationkmp

class GreetingModel {
    fun getWelcomeMessage(): String {
        return "Hello from ${getPlatformName()}!, the best platform ever"
    }

    fun getPlatform(): String {
        return getPlatformName()
    }
}
