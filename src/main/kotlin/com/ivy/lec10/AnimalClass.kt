package com.ivy.lec10

abstract class AnimalClass(
    protected val species: String,
    protected open val legCount: Int, // tip property를 override 하려면 open해야함
) {

    abstract fun move()


}