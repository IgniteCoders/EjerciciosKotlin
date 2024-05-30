package com.example.ejercicioskotlin

const val DEGREES_CELSIUS = "Celsius"
const val DEGREES_FAHRENHEIT = "Fahrenheit"
const val DEGREES_KELVIN = "Kelvin"

fun main() {
    println("Ejercicio de conversion de temperatura:")
    println("-*-----------------------------------*-")

    // Ejemplo con funciones anónimas
    printFinalTemperature(27.0, DEGREES_CELSIUS, DEGREES_FAHRENHEIT) { measurement ->
        measurement * 9 / 5 + 32
    }

    printFinalTemperature(350.0, DEGREES_KELVIN, DEGREES_CELSIUS) { measurement ->
        measurement - 273.15
    }

    printFinalTemperature(10.0, DEGREES_FAHRENHEIT, DEGREES_KELVIN) { measurement ->
        (measurement - 32) * 5 / 9 + 273.15
    }

    println("-*-----------------------------------*-")

    // Ejemplo con funciones declaradas
    printFinalTemperature(27.0, DEGREES_CELSIUS, DEGREES_FAHRENHEIT, ::celsiusToFahrenheit)

    printFinalTemperature(350.0, DEGREES_KELVIN, DEGREES_CELSIUS, ::kelvinToCelsius)

    printFinalTemperature(10.0, DEGREES_FAHRENHEIT, DEGREES_KELVIN, ::fahrenheitToKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val convertedValue = conversionFormula(initialMeasurement)
    val finalMeasurement = String.format("%.2f", convertedValue) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

fun celsiusToFahrenheit(measurement: Double): Double {
    return measurement * 9 / 5 + 32
}

fun kelvinToCelsius(measurement: Double): Double {
    return measurement - 273.15
}

fun fahrenheitToKelvin(measurement: Double): Double {
    return (measurement - 32) * 5 / 9 + 273.15
}

