package com.example.myapplication

fun main() {
    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12

    var result: Boolean

    // AND: both conditions must be true
    result = (number1 > number2) && (number3 > number2)
    println(result) 

    // OR: at least one condition must be true
    result = (number1 > number2) || (number3 > number2)
    println(result)
}