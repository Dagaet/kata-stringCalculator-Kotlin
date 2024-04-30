package dev.kata.stringcalculator

class StringCalculator {
    fun add(number: String): Int
    {
        if (number.isNotEmpty()) {
            val numbers = number.split(",")
            var sum = 0
            numbers.forEach { iterator -> sum += iterator.toInt() }
            return sum
        }
        return 0
    }
}
