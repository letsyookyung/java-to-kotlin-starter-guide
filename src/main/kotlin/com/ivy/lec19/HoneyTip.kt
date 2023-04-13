package com.ivy.lec19

import com.ivy.lec18.Fruit

// 1. Type Alias, 별칭을 정할 수 있음
// 2. as import
typealias FruitFilter = (Fruit) -> Boolean // 함수

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}

// 3. 구조분해, componentN
data class Person(
    val name: String,
    var age: Int,
)

class Person2(
    val name: String,
    val age: Int,
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {

    val person = Person("이유경", 100)
//    val (name, age) = person 구조분해는 componentN을 동작시키는거
    val name = person.component1()
    val age = person.component2()

    // data class가 아닌데 구조분해를 사용하고 싶다면, componentN 함수를 직접 구현해줄 수 있다


// 3. Jump와 Label (return / break / continue)
// return : 기본적으로 가장 가까운 enclosing function 또는 익명함수로 값이 반환된다
// break : 가장 가까운 루트가 제거된다
// continue : 가장 가까운 루프를 다운 step으로 보낸다
// forEach
    val numbers = listOf(1, 2, 3)

    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    // 만약 forEach문에서도 break, continue를 쓰고 싶은 경우에는
    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run // 이건 break를 하고 싶을 때
                return@forEach // 이건 continue 하고 싶을 때
            }
        }

    }


    abc@ for (i in 1..100) {
        for (j in 1..100) {
            println("${i} / ${j}")
            if (j == 2) {
                break@abc
            }
        }
    }


    // 4. TakeIf 와 TakeUnless
    // takeIf : 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null이 반환된다.
    // takeunless : 주어진 조건을 만족하지 않으면 그 값이, 그렇지 않으면 Null이 반환된다





}