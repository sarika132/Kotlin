package com.example.myapplication

fun main() {
    var result: Int = 5 + 2 * 4
    println("Result = $result") // Expected: 5 + (2 * 4) = 13

    result = (5 + 2) * 4
    println("Result = $result") // Expected: (5 + 2) * 4 = 28

    var x: Int = 8
    var y: Int = 4
    var z: Int = 2

    var sum: Int = x + -y * z
    println("x + -y * z = $sum")
}