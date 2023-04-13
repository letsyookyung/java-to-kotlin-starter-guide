package com.ivy.lec18


fun main() {
    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
        Fruit(1,"사과", 1000, 3000),
        Fruit(2,"사과", 1200, 3000),
        Fruit(3,"사과", 1200, 3000),

        ),
        listOf(
            Fruit(4,"바나나", 3000, 6000),
            Fruit(5,"바나나", 3200, 6000),
            Fruit(6,"바나나", 2500, 6000),
            Fruit(7,"수박", 10000, 12000),
        )
    )

    // tip flatMap 이거 뭔지 모르겠다
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }

    println(samePriceFruits)

    // flatten 모두 평탄화된 list


}