package com.example.myapplication

fun main(){
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "India" to "New Delhi",
        "China" to "Beijing"
    )
    println("All keys : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")

    println("Capital of Nepal is : ${countriesCapitals ["Nepal"]}")

    //Immutable Maps
    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )
    print("Enter student name: ")
//    val input: String = readln().lowercase()
//    println(studentMarks[input])

    //Mutable Maps
    val studentsMarks = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )
    studentsMarks["ram"] = 60
    studentsMarks.put("shyam", 80)
    print("Enter student name: ")
    val input: String = readln().lowercase()
    println(studentsMarks[input])


}