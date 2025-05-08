package com.example.myapplication

fun main() {
    var name = arrayListOf<String>("sarika", "ram", "shyam")

    name.add("hari")
    name.add(4, "Sita")
    name.remove("shyam")
    name.removeAt(0)

    println(name)

    var mixArrayList = arrayListOf<Any>("hello", 5, 2.0)

    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
}