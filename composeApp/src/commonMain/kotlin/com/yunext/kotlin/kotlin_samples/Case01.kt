package com.yunext.kotlin.kotlin_samples

fun main() {
    val name = "stranger"        // Declare your first variable
    println("Hi, $name!")        // ...and use it!
    print("Current count:")
    for (i in 0..10) {           // Loop over a range from 0 to 10
        print(" $i")
    }
}

data class User(val name: String, val age: Int)

object Singleton {
    private val msg:String = ""
    
    fun doSomething(){
    }
}

fun testSafe(){
    val name:String? = "kotlin"
    val length = name?.length
//    val length2 = name.length
    println(length)
}

