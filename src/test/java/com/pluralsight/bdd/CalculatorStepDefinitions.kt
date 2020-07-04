package com.pluralsight.bdd

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals

class CalculatorStepDefinitions : AcceptanceTestRunner() {
    private lateinit var calculator: Calculator
    private var result = 0

    @Given("I have a calculator")
    fun `I have a calculator`() {
        calculator = Calculator()
    }

    @When("I add {int} and {int}")
    fun `I add numbers`(a: Int, b: Int) {
        result = calculator.add(a, b)
    }

    @Then("I should get {int}")
    fun `I should get`(expectedResult: Int) {
        assertEquals(result, expectedResult)
    }
}
