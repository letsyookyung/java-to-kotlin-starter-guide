package com.ivy.lec02

import com.lannstark.lec02.Person

fun main() {
//    println(startsWith(null))

    // 또 다른 예시
    val person = Person("공부하는 개발자")
    startsWithoutQM(person.name) // java 코드의 @nullable 을 지우면, 우선 이게 null인지 아닌지 지금은 모르는 상태 : 플랫폼 타입

}

fun startsWithA1m(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}


fun startsWithA2m(str: String?): Boolean? {
    return str?.startsWith("A") // tip safe call은 null이면 그냥 전체가 null로 나옴
}

fun startsWithA3m(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A") // tip 절대 null일 수 없는데 자꾸 확인하니깐, 절대 null이 아니라고!! 소리치듯
    // 그래서 str에 null이 들어가면, 컴파일에러는 안나지만 런타임에러가 남
}


fun startsWithoutQM(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}