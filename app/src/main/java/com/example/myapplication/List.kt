package com.example.myapplication

fun main() {
    val numbers: List<String> = listOf("one", "two", "three", "four")

    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\": ${numbers.indexOf("two")}")

    //Immutable List
    val list = listOf("one", "two", "three")
    println("Immutable list")
    for (i in list.indices) {
        println(list[i])
    }
    println()

    // Mutable List
    val mutableList = mutableListOf("one", "two", "three")
    mutableList.add("Four")
    println("Mutable list")
    for (i in mutableList.indices) {
        println(mutableList[i])
    }
}
