package com.ivy.lec15


fun main() {

    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println(i)
    }

    for ((i, value) in array.withIndex())
        println("$i $value")
}