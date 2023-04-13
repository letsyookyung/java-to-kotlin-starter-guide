package com.ivy.lec15

fun main() {

    val oldMap = mutableMapOf<Int, String>()
//    oldMap.put(1, "Monday")
    oldMap[1] = "Monday"
    oldMap[2] = "Tuesday"

    mapOf(1 to "monday", 2 to "tuesday", 3 to "Wed")

    for (key in oldMap.keys) {
        println(key)
    }

    for ((key, value) in oldMap.entries) {
        println("$key $value")
    }


}

