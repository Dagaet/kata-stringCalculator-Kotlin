package dev.kata.stringcalculator

class StringCalculator {
    fun add(number: String): Int
    {
        if (number.isNotEmpty()) {
            var delimiter = ","
            var errorMessage = "error: negatives not allowed: "
            var sum = 0
            var numbers: List<String> = listOf()
            if (number.startsWith("//")){
                delimiter = number.substring(2,3)
                numbers = number.substring(4).split(delimiter)
            } else{
                numbers = number.split(delimiter)
            }

            numbers.forEach { iterator ->
                if (iterator.toInt() > 0 ){
                    sum += iterator.toInt()
                } else {
                    errorMessage += "$iterator "
                }
            }
            if (errorMessage.length > 30){
                throw Exception(errorMessage.substring(0, errorMessage.length-1))
            }
            return sum
        }

        return 0
    }
}
