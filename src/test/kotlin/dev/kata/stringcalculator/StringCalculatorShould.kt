package dev.kata.stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StringCalculatorShould {
//    Should return 0 when given an empty string

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
}
