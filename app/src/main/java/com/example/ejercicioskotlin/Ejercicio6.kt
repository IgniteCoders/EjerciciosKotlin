package com.example.ejercicioskotlin

/** Teléfonos plegables **/

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true) : Phone() {

    override fun switchOn() {
        if (!isFolded) {
            //isScreenLightOn = true
            super.switchOn()
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }

    fun foldOrUnfold() {
        isFolded = !isFolded
    }
}

fun main() {
    val foldablePhone = FoldablePhone()
    foldablePhone.switchOn()

    println("Pantalla encendida: ${foldablePhone.isScreenLightOn}")

    foldablePhone.unfold()
    foldablePhone.switchOn()

    println("Pantalla encendida: ${foldablePhone.isScreenLightOn}")
}