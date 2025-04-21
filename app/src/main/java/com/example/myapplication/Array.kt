package com.example.myapplication

fun main(args: Array<String>) {
    // Integer array
    var age = arrayOf(1, 2, 3)

    println(age.contentToString()) // To print full array properly

    println("The first element of age is " + age[0])
    println("The second element of age is " + age[1])
    println("The third element of age is " + age[2])

    println("***************************")

    // String array
    var name = arrayOf("Ram", "Shyam", "Hari")

    name[1] = "Sarika" // Replacing "Shyam" with "Sandis"

    println("The first element of name is " + name[0])
    println("The second element of name is " + name[1])
    println("The third element of name is " + name[2])

    println("The size of the name array is: " + name.size)
}

















