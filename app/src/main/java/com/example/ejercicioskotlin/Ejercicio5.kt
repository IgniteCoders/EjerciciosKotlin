package com.example.ejercicioskotlin

/** Perfil de Internet **/

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("- PROFILE -")
        println("Name: $name")
        println("Age: $age")

        // Construyo el texto del hobby
        var hobbyDescription = "Likes to $hobby. "
        if (referrer != null) {
            hobbyDescription += "Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}."
        } else {
            hobbyDescription += "Doesn't have a referrer."
        }
        // Imprimo el texto del hobby
        println(hobbyDescription)

        // Salto de linea para dejar un espacio
        println()
    }

    fun showProfile2() {
        println("- PROFILE -")
        println("Name: $name")
        println("Age: $age")

        // Imprimo el texto del hobby sin construirlo
        print("Likes to $hobby. ")
        if (referrer != null) {
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }

        // Salto de linea para dejar un espacio
        println()
    }
}

// Name: Amanda
// Age: 33
// Likes to play tennis. Doesn't have a referrer.
//
// Name: Atiqah
// Age: 28
// Likes to climb. Has a referrer named Amanda, who likes to play tennis.