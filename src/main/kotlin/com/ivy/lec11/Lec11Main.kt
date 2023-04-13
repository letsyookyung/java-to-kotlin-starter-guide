package com.ivy.lec11

fun directoryPath(path: String): Boolean {
    return path.endsWith("/")
}

// tip internal : 같은 모듈에서만 사용 (전체 한번에 컴파일되는 범위)
class Car(
    val name: String, // internal 붙이면, 해당 프로퍼티의 getter가 internal
    var owner: String, // private 붙이면, getter&setter가 private
    _price: Int,
) {

    var price = _price
        private set
}