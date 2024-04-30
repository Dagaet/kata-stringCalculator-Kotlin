package dev.kata.stringcalculator

class StringCalculator {
    fun add(number: String): Int
    {
        if (number.isNotEmpty()) {
            var delimiter = ","
            var sum = 0
            var numbers: List<String> = listOf()
            if (number.startsWith("//")){
                delimiter = number.substring(2,3)
                numbers = number.substring(4).split(delimiter)
            } else{
                numbers = number.split(delimiter)
            }

            numbers.forEach { iterator -> sum += iterator.toInt() }
            return sum
        }

        return 0
    }
}
