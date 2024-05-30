package com.example.ejercicioskotlin

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is ${ticketPrice(child, isMonday)}€.")
    println("The movie ticket price for a person aged $adult is ${ticketPrice(adult, isMonday)}€.")
    println("The movie ticket price for a person aged $senior is ${ticketPrice(senior, isMonday)}€.")

    // Ejemplo de error
    val ticketPrice = ticketPrice(134, isMonday)
    if (ticketPrice == -1) {
        println("Error")
    }
}

// Ejemplo con if else
/*fun ticketPrice(age: Int, isMonday: Boolean): Int {
    var price: Int = -1
    if (age <= 12) {
        price = 15
    } else if (age in 13..60) {
        if (isMonday)
            price = 25
        else
            price = 30
    } else if (age > 60 && age <= 100) {
        price = 20
    }

    return price
}*/

// Ejemplo con when
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}

// El resultado final debería ser el siguiente:
// The movie ticket price for a person aged 5 is $15.
// The movie ticket price for a person aged 28 is $25.
// The movie ticket price for a person aged 87 is $20.
