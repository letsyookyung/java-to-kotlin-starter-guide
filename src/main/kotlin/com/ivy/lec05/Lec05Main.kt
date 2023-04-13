package com.ivy.lec05

fun main() {

}

// tip if문
fun validateScoreNotNegative(score: Int) {
    if (score < 0 ) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다")
    }
}

// 자바에서는 if-else는 statement : 프로그램의 문장, 하나의 값으로 도출되지 않음
// 코틀린에서는 if-else는 expression : 하나의 값으로 도출되는 문장
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100 ) {
        throw IllegalArgumentException("${score}는 0과 100사이에 있지 않습니다")
    }
}

// tip switch 와 when
fun getGradeWithSwitch(score: Int): String {
//    return when (score / 10) {
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        else -> "0"
//    }

    return when (score) { //이렇게해도 됨
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "0"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    return when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}

