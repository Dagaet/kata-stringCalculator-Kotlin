package dev.kata.stringcalculator

class StringCalculator {
    fun add(number: String): Int
    {
        if (number != "") {
            return number.toInt()
        } else{
            return 0
        }
    }
}
