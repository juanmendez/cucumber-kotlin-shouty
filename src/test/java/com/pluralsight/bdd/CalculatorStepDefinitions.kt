package com.pluralsight.bdd

import io.cucumber.datatable.DataTable
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals

/**
 * To learn more about data-tables
 * @read https://www.baeldung.com/cucumber-data-tables
 */
class CalculatorStepDefinitions : AcceptanceTestRunner() {
    private lateinit var calculator: Calculator
    private val results = mutableListOf<Int>()

    @Given("I have a calculator")
    fun `I have a calculator`() {
        calculator = Calculator()
    }

    // we could have treated this as a map having key as integer, and value as integer
    // but for learning reasons we are exploring how to convert a data-table into a map instead
    // in a sense data-tables are very similar to a csv format
    @When("I add the following:")
    fun `I add numbers`(additions: DataTable) {
        val numbers = additions.asMap<Int, Int>(Int::class.java, Int::class.java)

        numbers.forEach { (a, b) ->
            results.add(calculator.add(a,b))
        }
    }

    // we could have treated the data as being a data-table
    // instead, we can treat it a list of strings since it only has one column
    @Then("I should see this expected result:")
    fun `I should get`(expectedResults: List<Int>) {
        expectedResults.forEachIndexed { i, value ->
            assertEquals(results[i], value)
        }
    }
}
