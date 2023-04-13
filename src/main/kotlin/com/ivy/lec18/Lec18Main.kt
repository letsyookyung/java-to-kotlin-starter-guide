package com.ivy.lec18

/*
filter/ filtereIndexed / map / mapIndexed / MapNotNull 등을 이용해서
filterFruits라는 함수를 함수형으로 바꿀 수 있음

*/

fun main() {
    // Q. 사과만 주세요
    val fruits: List<Fruit> = listOf(
        Fruit(1,"사과", 1000, 3000),
        Fruit(2,"사과", 1200, 3000),
        Fruit(3,"사과", 1200, 3000),
        Fruit(4,"바나나", 3000, 6000),
        Fruit(5,"바나나", 3200, 6000),
        Fruit(6,"바나나", 2500, 6000),
        Fruit(7,"수박", 10000, 12000),
    )

    val apples = fruits.filter { fruit ->
        fruit.name == "사과"
    }

    val applesIdx = fruits.filterIndexed { idx, fruit ->
//        println(idx)
        fruit.name == "사과"
    }
    println(apples)

    // Q. 사과들의 가격들을 알려주세요
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice; fruit.id }

    println(applePrices)

    // Q. mapping의 결과가 null이 아닌 것만 가져오고 싶다면?
//    val values = fruits.filter { fruit -> fruit.name == "사과"}
//        .mapNotNull { fruit -> fruit.nullOrValue() }

    // Q. 혹시 출고가 10,000원 이상의 과일이 하나라도 있나요?!
    // all, none, any(하나라도 만족)
    val isAllApple = fruits.any { fruit ->
        fruit.factoryPrice >= 3000
    }
    println(isAllApple)

    // Q. 총 과일 개수가 몇개인지?
    val fruitCount = fruits.count()
    println(fruitCount)

    // Q. 낮은 가격 순으로 보여주세요.
    // sortedBy , sortedByDescending
    val totalFruitsByLowPrice = fruits.sortedBy { fruit ->
        fruit.currentPrice
    }
    println(totalFruitsByLowPrice)

    // Q. 총 과일 종류가 몇개인지?
    // distinctBy: 변형된 값을 기준으로 중복을 제거한다
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name } //이름을 기준으로
        .map { fruit -> fruit.name }

    // Q. 첫번째 과일을 주세요, 마지막 과일을 주세요.
    val firstFruit = fruits.first()
    val firstFruitOrNull = fruits.firstOrNull() //비어있는건 null이 반환

    // List를 Map으로 바꾸기 (groupBy)
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    println("이름을 기준으로 그룹화시킨 map: ${map}")

    val mapByPrice: Map<Long, List<Fruit>> = fruits.groupBy { fruit -> fruit.factoryPrice }
    println("가격을 기준으로 그룹화시킨 map: ${mapByPrice}")

    // associateBy (id 기준으로)
    val mapId: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
    println("ID를 기준으로 : ${mapId}")

    // 과일이름 -> 출고가 리스트
    val mapFruitByPrice: Map<String, List<Long>> = fruits
        .groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })
    println("과일 : 출고가 -> ${mapFruitByPrice}")

    //
    val mapIdByPrice: Map<Long, Long> = fruits
        .associateBy({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })
    println("id : 출고가 -> ${mapIdByPrice}")

    // map에 대해서도 앞선 기능들을 대부분 사용할 수 있음
    val mapEx: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }
    println(mapEx)



}


// 17Lambda에 있는 filterFruits 대체
// tip 모르겠음
fun filterFruits(
    fruits: List<com.lannstark.lec17.Fruit>, filter: (com.lannstark.lec17.Fruit) -> Boolean
): List<com.lannstark.lec17.Fruit> {
    return fruits.filter(filter)
}