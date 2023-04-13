package com.ivy.lec03

import com.lannstark.lec03.Person

/*
Any = Object
Unit = void
Nothing -> 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
 */



fun main() {

//    val number1 = 3 // int
//    val number2: Long = number1.toLong()
//
//    val number3: Int? = 3 // int
//    val number4: Long = number3?.toLong() ?: 0L

    val str = """
        안녕하세요.
        뾰 롱
        롱
        
        집집
    """.trimIndent()
    println(str)



}

fun printAgeIfPerson(obj: Any) { // java의 instanceOf
    if (obj is Person) { // is, !is
//        val person = obj as Person // obj타입을 Person타입으로 간주함
//        println(person.age)

        println(obj.age) // 심지어 이것도 됨 // tip 스마트캐스팅
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as Person //tip 이런것도 있음 as? 이면 에러 대신 null로 나옴, safe 형변환 느낌
    println(person.age)
}

