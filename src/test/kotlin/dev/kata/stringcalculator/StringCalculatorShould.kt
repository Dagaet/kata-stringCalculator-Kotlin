package dev.kata.stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doThrow
import org.mockito.kotlin.mock

internal class StringCalculatorShould {
//    Should return 0 when given an empty string
//    Should return a number when given a number
//    Should return the sum when given two numbers
//    Should return the sum of numbers when there are different delimiters


    @Test
    fun `Return 0 when given an empty string`() {
        val stringCalculator = StringCalculator()
        val result = stringCalculator.add("")

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `Return the number when given only a number`(){
        val stringCalculator = StringCalculator()
        val result = stringCalculator.add("3")
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun `Return the sum when given two numbers`(){
        val stringCalculator = StringCalculator()
        val result = stringCalculator.add("3,1")
        assertThat(result).isEqualTo(4)
    }

    @Test
    fun `Return the sum when there are different limiters`(){
        val stringCalculator = StringCalculator()
        val result = stringCalculator.add("3,1/2\n1")
        assertThat(result).isEqualTo(7)
    }
}
