package dev.kata.stringcalculator

class StringCalculator {
    fun add(number: String): Int
    {
        if (number.isNotEmpty()) {
            return number.toInt()
        }
        return 0
    }
}
