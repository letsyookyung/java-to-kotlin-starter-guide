package com.ivy.lec06

// tip 반복문
// 1. for each
fun iterate1() {

    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }
}

fun interateOrigin() {

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

}

// tip while 문은 자바랑 동일