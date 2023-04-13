package com.ivy.lec16

import com.lannstark.lec03.Person

// 지역 함수
// 함수 안에 함수를 선언할 수 있다
// 중복되는 부분 제거하는 느낌의 함수처럼 에시
// ㅈㅣ금 함수 안에서만 쓰고 싶을 때
// 하지만 선호 하지 않음, 지저분함, depth가 깊어지기도 해서

fun createPerson(first: String, last: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("오류입니다")
        }
    }

    validateName(first, "firstName")
    validateName(last, "lastName")

    return Person(first, 3)

}