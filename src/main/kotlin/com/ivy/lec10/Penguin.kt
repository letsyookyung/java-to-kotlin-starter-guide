package com.ivy.lec10

class Penguin(
    species: String,
) : AnimalClass(species, 2 ), Swimable, Flyable {

    private val wingCount: Int = 2
    override fun move() {
        println("팽귄이 움직입니다~ 뒤뚱뒤뚱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

    override val swimAbility: Int
        get() = 3


}