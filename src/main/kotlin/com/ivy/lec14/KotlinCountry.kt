package com.ivy.lec14

// enum class
fun handleCountry(country: KotlinCountry) {
    when (country) {
        KotlinCountry.KOREA -> TODO()
        KotlinCountry.AMERICA -> TODO()
    }
}

enum class KotlinCountry(
    private val code: String,
) {

    KOREA("KO"),
    AMERICA("US"),
    AMCA("US"),
    ;
}

// sealed class, sealed interface 외부에서 상속 받지 않도록 , 하위 클래스를 봉인하자
// 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.
// 즉 런타임때 클래스 타입이 추가될 수 없다.
// 하위 클래는 같은 패키지에 있어야 한다.
// tip enum class vs sealed class 장단 확인
sealed class HyundaiCar (
    val name: String,
)

class Avante : HyundaiCar("아반떼")


