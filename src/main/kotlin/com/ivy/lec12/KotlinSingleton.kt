package com.ivy.lec12

//object를 붙이면 싱글톤이 됨

fun main() {

    println(Singleton.a)
    Singleton.a += 10

}
class KotlinSingleton {
}


object Singleton {
    var a = 0
}