package com.example.myapplication

fun main() {
    var x: Int = 20
    var y: Int = 10
    var z: Int = 0

    z = x + y
    println("z = x + y = $z")

    z += x
    println("z += x = $z")

    z -= x
    println("z -= x = $z")

    z *= x
    println("z *= x = $z")

    z /= x
    println("z /= x = $z")

    z %= x
    println("z %= x = $z")
}