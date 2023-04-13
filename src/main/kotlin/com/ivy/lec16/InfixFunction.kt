package com.ivy.lec16

// 중위 함수 infix 함수

fun main() {
    3.add(4)
    3.add2(4)
    3 add2 4
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}