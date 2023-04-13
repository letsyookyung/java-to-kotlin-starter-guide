package com.ivy.lec08

import com.lannstark.lec08.Lec08Main

fun max(a: Int, b: Int): Int = //함수가 하나의 결과값이면 이렇게 쓸 수 있음 //타입도 생략할 수 있음
    if (a > b) {
        a
    } else {
        b
    }
//위 것이 이렇게도 단축될 수 있음
fun max2(a: Int, b: Int) = if (a > b) a else b

// default parameter //함수를 사용하려면 자꾸 귀찮게 해야되는 일이 있다면
//fun main() {
//    repeat("바보")
//    repeat("바보", useNewLine = false) //named argument
//}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true //
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

fun main() {
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C") // 배열엔 spread 연산자 필요
    printAll(*array) // tip spread 연산자
}

// 같은 타입의 여러 파라미터 받기 (가변인자)
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}