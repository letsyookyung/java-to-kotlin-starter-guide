package com.ivy.lec10

fun main() {
    Derived(300)
}


open class Base(
    open val number: Int = 100
) {
    init {
        println("Base class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init{
        println("Derived class")
    }
}