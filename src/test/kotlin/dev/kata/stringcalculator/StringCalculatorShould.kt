package dev.kata.stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StringCalculatorShould {
//  Should return 0 when given an empty string
//  Should return the sum of two numbers when given
//  Should return the sum of any quantity of numbers
//  Should return the sum of any quantity of given numbers specifying its separator

    @Test
    fun `Return 0 when given an empty string`() {
        val stringCalculator = StringCalculator()
        val result = stringCalculator.add("")

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `Return the same number when given`() {
        val stringCalculator = StringCalculator()
        val result = stringCalculator.add("2")

        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `Return the sum of two given numbers`() {
        val stringCalculator = StringCalculator()
        val result = stringCalculator.add("2,4")

        assertThat(result).isEqualTo(6)
    }

    @Test
    fun `Return the sum of any quantity of given numbers`() {
        val stringCalculator = StringCalculator()
        val result = stringCalculator.add("1,2,3,4,5,6,7,8,9")

        assertThat(result).isEqualTo(45)
    }

    @Test
    fun `Return the sum of any quantity of given numbers specifying its separator`() {
        val stringCalculator = StringCalculator()
        val result = stringCalculator.add("//;\n1;2;3;4;5;6;7;8;9")

        assertThat(result).isEqualTo(45)
    }
}
