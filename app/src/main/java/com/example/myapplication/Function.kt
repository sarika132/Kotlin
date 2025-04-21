package com.example.myapplication

fun show(a: Int, b: Int) {
    println("You entered $a and $b")
}
fun add(a: Int, b: Int): Int {
    var suM = 0
    suM = a + b
    return suM
}
fun findMinimumNumber(a: Int, b: Int): Int {
    var minimum = 0
    if (a > b) {
        minimum = b
    } else {
        minimum = a
    }
    return minimum
}

fun main() {
    println("Enter first number: ")
    val a: Int = readln()!!.toInt()

    println("Enter second number: ")
    val b: Int = readln()!!.toInt()

    show(a, b)

    val suM = add(a, b)
    println("Sum of the two entered numbers is $suM")

    val minimum = findMinimumNumber(a, b)
    println("And the smallest between $a and $b is $minimum")
}

