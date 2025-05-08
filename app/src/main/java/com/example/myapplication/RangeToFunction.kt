package com.example.myapplication

fun main() {
    val myCharRange = 'a'..'j'  // range from 'a' to 'j'
    val testCharRange = 'a'..'j'

    val check = 'Z' in testCharRange  // 'Z' is NOT in the range

    println("myCharRange has Z: $check")
    println("myCharRange: $myCharRange")
    println("testCharRange: $testCharRange")


    print("Enter name:: ")
    val name: String? = readln()  // Nullable String input

    // The data user inputs is always a String, so we convert it to Int
    print("Enter age:: ")
    val age: Int = readln()!!.toInt()  // Convert input to Int using !! and toInt()

    println("Name: $name")
    println("Age: $age")

}