package io.cucumber.shouty

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions

class StepDefinitions : AcceptanceTestRunner() {
    private var sean = Person("Local Sean")
    private var lucy = Person("Local Lucy")
    private var messageFromSean: String = ""

    // Cucumber is able to match Lucy with {person} while finding match in our class ParameterTypes
    @Given("{person} is located {int} meters from {person}")
    fun `lucy is located meters from sean`(
            generatedLucy: Person,
            distance: Int,
            generatedSean: Person
    ) {
        println("${generatedLucy.name} is located $distance meter(s) away from ${generatedSean.name}")
        generatedLucy.moveTo(distance)
    }

    @When("Sean shouts {string}")
    fun `sean shouts`(message: String) {
        messageFromSean = message
        sean.show(message)
        lucy.heard(message)
    }

    @Then("Lucy hears Sean's message")
    fun `lucy hears sean's message`() {
        println("${lucy.name} hears ${sean.name}'s message")
        Assertions.assertEquals(listOf(messageFromSean), lucy.messagesHeard)
    }
}
