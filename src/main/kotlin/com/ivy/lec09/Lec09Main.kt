package com.ivy.lec09

fun main() {
    val p = Person()
//    println(p.name)
//    println(p.age)
}
// tip java에서의 property : 필드 + getter + setter
// 하지만 kotlin에서는 필드 + 자동으로 만들어줌
// kotlin에서는 생성자에서 프로퍼티를 바로 만들 수 있음
class Person ( // 주생성자 primary constructor, 단 파라미터가 하나도 없는데 생략 가능
//    val name: String = "이유경",  // 이름을 대문자로 보여주는 getter를 만들려고 하는데, 그러면 선언을 밑에쪽에 하기
    name: String = "이유경",
    private var age: Int = 1,
) {
//
//    val name = name
//        get() = field.uppercase() //tip field!!로, name으로 하면, name의 getter가 되니 무한루프가 발생함
//        //자기 자신을 가리키는 것 = field == backing field라 부름, 근데 이렇게 잘 안씀!
//
//    // 대신 이런식으로 쓰는게 나음
//    val uppercaseName: String
//        get() = this.name.uppercase()
//

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
        println("초기화 블록")
    }

    //  부생성자(secondary constructor) 최종적으로 주생성자를 this로 호출해야한다
    // 이것 보단 정적 팩토리 메소드를 추천
//    constructor(name: String): this(name,1) {
//        println("첫번째 부생성자")
//    }
//
//    constructor(): this("최태현") {
//        println("두번째 부생성자")
//    }

//    // 함수처럼 해도되고
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }
//
//    // tip custom getter
//    val isAdult: Boolean
//        get() = this.age >= 20



}