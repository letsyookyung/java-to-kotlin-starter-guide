package com.ivy.lec12

class KotlinPerson(
    var name: String,
    var age: Int,
) {

    // 동행 객체 java의 static이 붙어있는것 = 클래스와 동행하는 유일한 오브젝트
    // static : 클래스가 인스턴스화 될 때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유
    companion object Factory: Log  { //이름을 붙일 수 있음
        private const val MIN_AGE = 1 // const : 컴파일 시에 변수가 할당됨, 진짜 상수에 붙이기 위한 용도, 기본 타입과 String에 붙일 수 있음

        @JvmStatic //이렇게하면 바로 KotlinPerson.newBaby("이름") 으로 사용가능,
        // 만약 아니면 KotlinPerson.companion.newBaby("이름") 으로 써야하고,
        fun newBaby(name: String): KotlinPerson {
            return KotlinPerson(name, MIN_AGE)
        } // 하나의 객체로 간주된다

        override fun log() {
            println("나는 KotlinPerson의 동행객체 factory 예요")
        }
    }


}


interface Log {

    fun log()
}