package com.ivy.lec15

fun main() {

    val numbers = listOf(100, 200, "하이")

    val empty = emptyList<String>()

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, number) in numbers.withIndex()) {
        println("$idx, $number")
    }


}

