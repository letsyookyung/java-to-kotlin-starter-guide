package com.ivy.lec10

class Cat(
    species: String // species가 밑으로 넘어감
) : AnimalClass(species, 4) {
    override fun move() {
        println("고양이가 사뿐사뿐")
    }

}