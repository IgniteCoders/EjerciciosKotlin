package com.example.ejercicioskotlin

/** Catálogo de canciones **/

fun main() {
    val song1 = Song()
    song1.title = "Fortunate Son"
    song1.artist = "Creedence Clear Water Revival"
    song1.yearPublished = 1969
    song1.playCount = 1256

    val song2 = Song()
    song2.title = "Off the wall"
    song2.artist = "Michael Jackson"
    song2.yearPublished = 1979
    song2.playCount = 948

    song1.description()
    song1.isPopular()
    song2.description()
    song2.isPopular()
}

class Song {
    var title: String = ""
    var artist: String = ""
    var yearPublished: Int = 0
    var playCount: Int = 0

    // Propiedad dinámica
    val isPopular: Boolean
        get() {
            var result = false
            if (playCount >= 1000) {
                result = true
            }
            return result
        }

    // Se puede simplificar así:
    /*val isPopular: Boolean
        get() = playCount >= 1000*/

    fun description () {
        println("$title, performed by $artist, was released in $yearPublished.")
    }

    fun isPopular() {
        if (isPopular) {
            println("$title is popular")
        } else {
            println("$title is not popular")
        }
    }
}