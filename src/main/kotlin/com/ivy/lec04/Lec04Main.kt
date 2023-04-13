package com.ivy.lec04

import com.lannstark.lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    if (money1 > money2) { //compareTo 를 자동으로 호출함
        println("money1이 money2보다 금액이 큼")
    }

    println(money1 == money2) // tip 값을 비교하는거
    println(money1 === money3) // 주소가 같은지 보는거

    //lazy연산
    if (fun1() || fun2()) { // 또는 이니깐! 이미 더 볼 필요도 없이 true 고 그 반대도 더이상 볼 필요없으면 나와버림
        println("본문")
    }

}

fun fun1(): Boolean {
    println("fun 1")
    return true
}


fun fun2(): Boolean {
    println("fun 2")
    return false
}