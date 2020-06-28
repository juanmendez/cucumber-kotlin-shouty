package io.cucumber.shouty

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions

class StepDefinitions {
    private lateinit var sean: Person
    private lateinit var lucy: Person
    private var messageFromSean: String = ""

    // here (s) helps with singular or plural
    // using wordA/wordB to apply either or
    @Given("Lucy is standing/located {int} meter(s) from Sean")
    fun `lucy is located meters from sean`(distance: Int?) {
        lucy = Person()
        sean = Person()
        lucy.moveTo(distance)
    }

    @When("Sean shouts {string}")
    fun `sean shouts`(message: String) {
        messageFromSean = message
        sean.show(message)
        lucy.heard(message)
    }

    @Then("Lucy hears Sean's message")
    fun `lucy hears sean's message`() {
        Assertions.assertEquals(listOf(messageFromSean), lucy.messagesHeard)
    }
}