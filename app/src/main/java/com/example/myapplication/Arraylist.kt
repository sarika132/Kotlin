package com.example.myapplication

fun main() {
    var name = arrayListOf<String>("sandis", "ram", "shyam")

    name.add("hari")                         // Add to end
    name.add(4, "Sita")          // Add "Sita" at index 4
    name.remove("shyam")               // Remove by value
    name.removeAt(0)                     // Remove by index

    println(name)

    var mixArrayList = arrayListOf<Any>("hello", 5, 2.0)

    println(mixArrayList[0])                 // prints: hello
    println(mixArrayList[1])                 // prints: 5
    println(mixArrayList[2])                 // prints: 2.0
}