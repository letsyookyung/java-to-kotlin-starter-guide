package com.ivy.lec12


// 익명 클래스
fun main() {
    moveSomething(object: Movable {
        override fun fly() {
            TODO("Not yet implemented")
        }

        override fun move() {
            TODO("Not yet implemented")
        }
    })
}



private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}