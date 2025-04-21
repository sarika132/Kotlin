package com.example.myapplication

fun main() {
    var a: String = "Hello world"
    var i: Int = a.length
    var x: Boolean = a.equals("Hello world")
    var username: String = "   softwarica   "

    println(username.trim())          // to removes spaces from both ends
    println(a)                        //  to prints original string
    println(i)                        // length of string
    println(a.isEmpty())              // to check  empty
    println(a.lowercase())            // to converts to lowercase
    println(a.uppercase())            // to converts to uppercase
    println(x)
    print(a.plus(", How are you?"))   // string concatenation
}