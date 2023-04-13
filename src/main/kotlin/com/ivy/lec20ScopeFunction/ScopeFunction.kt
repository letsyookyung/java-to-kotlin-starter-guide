package com.ivy.lec20ScopeFunction

import com.ivy.lec19.Person

/*
    scope function : 일시적인 영역을 형성하는 함수
    *람다*를 사용해 일시적인 영역을 만들고 코드를 더 간결하게 만들거나,
    method changing에 활용하는
    함수를 scope function이라고 함

 */

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPerson1(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

// 확장함수의 특징 : 마치 멤버 함수를 쓰는 것처럼 사용되는 것
fun main() {

    val person = Person("이유경", 10)

    // let & run : 확장함수. 람다를 받아, 다반 람다 결과를 반환한다
    // 1. let
    val value1 = person.let {
        it.age // ==> value1 == age가 반영
    }
    // - 하나 이상의 함수를 call chain 결과로 호출 할 때
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println) // == { lengths(list<Int>에 대한) -> println(lengths)

    // - non-null 값에 대해서만 code block을 실행시킬 때
//    val length = str?.let {
//        println(it.uppercase())
//        it.length
//    }

    // - 일회성으로 제한된 영역에 지역 변수를 만들 때
    val numberString = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numberString.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)

     // 2. run
     // - 객체 초기화와 반환 값의 계산을 동시에 해야 할 때
    // - 객체를 만들어 DB에 바로 저장하고, 그 인스턴스를 활용할 때
//    val person = Person("이유경", 10).run(personRepository::save)

//    val person = Person("이유경", 10).run {
//        this.age = 30
//        personRepository.save(this)
//    }
//
//    val value2 = person.run {
//        this.age // ==> value2 == age가 반영
//    }

    // also & apply : 객체 그 자체를 반환한다
    //3. also
    // 객체를 수정하는 로직이 call chain 중간에 필요할 때
    val numbers = mutableListOf("one")
        .also { println("four ")}
        .add("4")

    val value3 = person.also {
        it.age // ==> value3 == person
    }

    // 4. apply
    // 객체 설정을 할 떄에 객체를 수정하는 로직이 call chain 중간에 필요할 때
    fun createPerson(
        name: String,
        age: Int,
        hobby: String,
    ): Person {
        return Person(
            name = name,
            age = age,
        ).apply {
//            this.hobby = hobby
        }
    }
    val value4 = person.apply {
        this.age // ==> value4 == person
    }

    // 5. with
    // 특정 객체를 다른 객체로 변환해야 하는데,
    // 모듈 간의 의존성에 의해 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때
    with(person) {
        println(name)
        println(this.age)
    }

    // this를 생략할 수 있어 필드가 많아도 코드가 간결해진다


}

// this 와 it 사용의 차이
// this : this는 생략 가능하지만, 말을 바꿔서 사용할 수 없음
// it : it은 생략이 불가능하지만, 말을 바꿔서 사용할 수 있음