package com.ivy.lec16

// 확장 함수
// 멤버 함 수 중에 나오면, 멤버 함수가 먼저 호출됨
fun main() {
    val str = "BC"
    println(str.lastChar())

}

// String을 확장하는
// 확장하려는 클래스 = 수식 객체 타입
// this = 수신 객체
fun String.lastChar(): Char {
    return this[this.length -1] // this를 통해서 불려진인스턴스에 접근 가능
}