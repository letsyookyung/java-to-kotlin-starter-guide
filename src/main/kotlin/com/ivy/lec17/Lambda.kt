package com.ivy.lec17

import com.lannstark.lec17.Fruit

// 1. Java에서 람다를 다루기 위한 노력
// 람다: '메소드 자체를 직접 넘겨주는 것처럼' 쓸 수 있다
// 스트림이 등장한 이유 설명

// 2. 코틀린에서의 람다
// 코틀린에서는 함수가 그 자체로 값이 될 수 있다.
// 변수에 할당할수도, 파라미터로 넘길 수 있다
// 람다 : 익명함수


fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000),
    )
    // 1.람다를 만드는 방법
    // fun 뒤에 이름 없는 함수로 만드는 방법
    // 필터 역할
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean { //fun 뒤에 이름이 없음, 이름 없는 함수 = 람다 니깐
        return fruit.name == "사과"
    }

    // 2.람다를 만드는 방법
    // { } 와 ->  를 이용하며 만드는 방법
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    // 3. 람다를 직접 호출하는 방법1
    isApple(fruits[0])
    // 4. 람다를 직접 호출하는 방법2
    isApple.invoke(fruits[0])


    filterFruits(fruits, isApple)
    filterFruits(fruits) { it.name == "사과"} //람다방법2로 쓸때 이렇게까지 생략이 가능

}


private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
       }
    }
    return results
}
