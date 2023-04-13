package com.ivy.lec14

fun main() {
    val dto1 = KotlinPersonDto("이유경", 100)
    val dto2 = KotlinPersonDto("이유경", 100)
    println(dto1 == dto2)
    println(dto1)
}



// data class를 붙이면, 자동으로 builder, equals, hashCode, toString을 붙여줌
data class KotlinPersonDto(
    val name: String,
    val age: Int,
) {
}