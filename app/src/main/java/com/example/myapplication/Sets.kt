package com.example.myapplication

fun main(){
    val numbers = setOf(1,3,5,7)
    for (elements in numbers){
        println(elements)
    }
    val numbersBackwards = setOf(7, 5, 3, 1)
    println("The sets are equall: ${numbers == numbersBackwards}")


}