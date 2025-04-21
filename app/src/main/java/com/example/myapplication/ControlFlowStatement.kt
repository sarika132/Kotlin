package com.example.myapplication

import kotlin.random.Random
fun main() {
    //if-else statement
    print("Please enter a number: ")

    val number = readln()!!.toInt()  // Directly read as Int

    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }


    //If-Else - if ladder statement
    print("Please enter your age :: ")

    val yourAge: Int = readln()!!.toInt()

    if (yourAge < 13) {
        println("You are a child")
    } else if (yourAge < 19) {
        println("You are a teenager")
    } else if (yourAge < 50) {
        println("You are an adult")
    } else {
        println("You are a senior")
    }


    //If-Else - if ladder statement
    println("Please enter 3 numbers:")

    val number1: Int = readln()!!.toInt()
    val number2: Int = readln()!!.toInt()
    val number3: Int = readln()!!.toInt()

    val largestNumber: Int

    if (number1 >= number2) {
        if (number1 >= number3) {
            largestNumber = number1
        } else {
            largestNumber = number3
        }
    } else {
        if (number2 >= number3) {
            largestNumber = number2
        } else {
            largestNumber = number3
        }
    }

    println("The largest number is $largestNumber")


    //When statement
    print("Please enter a day number of week : - ")
    val dayNumber: Int = readln().toInt()

    val day = when (dayNumber) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day choice"
    }
    println(day)


    //For Loop
    for (i in 1..9) {
        println(i)
    }

    // Second loop: calculates the sum of numbers from 0 to 5
    var sum = 0
    for (x in 0..5) {
        println(x)
        sum += x
    }
    println("Sum: $sum")


    var sum2 = 0
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            sum2 += x
        }
    }
    println("The sum of even numbers is $sum2")


    val vehicle = arrayListOf("Tata", "Kia", "Hyundai", "MG")

    for (y in vehicle.indices) {
        println("The value at index $y is: ${vehicle[y]}")
    }


    //For each Loop
    val vehicle1 = arrayListOf("Tata", "Kia", "Hyundai", "MG")

    vehicle1.forEach {
        println(it)
    }


    //While Loop
    var i: Int=0;
    while (i < 5) {
        println(i)
        i++
    }

    var k = 1
    var fact = 1

    while (k < 6) { // Loop from 1 to 5
        fact *= k   // fact = fact * k
        println("$k! = $fact") // Print the factorial
        k++ // Increment k
    }


    //Infinite Loop

    val numberr = Random.nextInt(from = 0, until = 10000)

    println("Please enter any number from 0 to 10000:")

    while (true) {
        val userGuess: Int = readln()!!.toInt()

        if (userGuess == numberr) {
            println("Congratulations!!!! You won")
            break
        } else if (userGuess<numberr) {
            println("Increase your guess ")
        } else {
            println("Decrease your guess ")
        }
    }


    //Do-while Loop
    var nummber = 1

    do {
        println(nummber)
        nummber++
    } while (nummber <= 15)

}
