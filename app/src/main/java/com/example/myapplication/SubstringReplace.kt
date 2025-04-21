package com.example.myapplication

fun main() {
    var a: String = "Hello world"
    var i: Int = a.length
    var x: Boolean = a.equals("Hello world")
    var username: String = "   softwarica   "

    println(username.trim())          // Removes spaces from both ends
    println(a)                        // Prints original string
    println(i)                        // Length of string
    println(a.isEmpty())              // Checks if empty
    println(a.lowercase())            // Converts to lowercase
    println(a.uppercase())            // Converts to uppercase
    println(x)                        // Result of equals check
    print(a.plus(", How are you?"))   // String concatenation
}