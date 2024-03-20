package dev.kata.stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doThrow
import org.mockito.kotlin.mock

internal class StringCalculatorShould {
//    When given an empty string return 0
//    Given a number return the number
//

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
}
