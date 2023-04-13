package com.ivy.lec13

// 중첩 클래스 (권장되는)
class KotlinHouse (
    private val address: String,
    private val livingRoom: LivingRoom,
) {

    class LivingRoom (
        private var area: Double,
    )

}

// 내부 클래스 (권장되지 않는)
class KotlinHouseInner (
    private val address: String,
    private val livingRoom: LivingRoom,
) {

    inner class LivingRoom (
        private var area: Double,
    ) {
        val address: String
            get() = this@KotlinHouseInner.address
    }

}
