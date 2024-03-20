package dev.kata.stringcalculator

class StringCalculator {
    fun add(number: String): Int
    {
        if (number != "") {
            var sum = 0
            val numbers = number.split(",")
//            for (i in numbers){
//                println(i)
//            }
            for (value in numbers) {
                sum += value.toInt()
                println(sum)
            }
            return sum
        } else{
            return 0
        }
    }
}
