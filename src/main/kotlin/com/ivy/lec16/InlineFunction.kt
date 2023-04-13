package com.ivy.lec16

// inline 함수 : 함수가 호출되는 대신, 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우
// 함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있다.
// 하지만 inline 함수의 사용은 성능 측정과 함꼐 신중하게 사용되어야 함
fun main() {
    3.multiply(3) // 곱하기하는 로직 자체가 그 함수를 부르는 쪽에 복사 붙여넣기 된거
}

inline fun Int.multiply(other: Int): Int {
    return this * other
}