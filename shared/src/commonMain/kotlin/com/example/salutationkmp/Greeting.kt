package com.example.salutationkmp

class Greeting {
    //private val platform: Platform = getPlatform()

    fun greet(): String {
        //return "Hello, ${platform.name}!"
        //return "Hello, the latest platform version is: ${platform.name}!"    //normal implementation without expect/actual
        return "Hello from ${getPlatformName()}!" //using expect and actual functions implementations
    }
}