package com.example.ejercicioskotlin

fun main() {
    val morningNotification = 58
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("Tienes $numberOfMessages mensajes")
    } else {
        println("Tu telefono va a explotar, tienes +99 mensajes!")
    }
}
