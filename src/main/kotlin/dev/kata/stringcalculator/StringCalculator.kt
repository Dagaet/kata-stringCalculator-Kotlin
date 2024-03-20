package dev.kata.stringcalculator

class StringCalculator {
    fun add(number: String): Int
    {
        if (number != "") {
            var sum = 0
            val numbers = number.split(",")
            for (value in numbers) {
                sum += value.toInt()
            }
            return sum
        } else{
            return 0
        }
    }
}
