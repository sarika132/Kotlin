package com.example.myapplication

fun main() {
    var number: Double = 7.6
    var isCheck: Boolean = true

    println("+number = ${+number}")
    println("-number = ${-number}")

    ++number
    println("++number = $number")

    --number
    println("--number = $number")

    println("!isCheck = ${!isCheck}")

    println("------------------")

    var result: Double = 4.7
    println("result: $result")

    // result++ returns the value first, then increments
    println("result++: ${result++}")
    println("After result++: $result")
}