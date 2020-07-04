package io.cucumber.shouty.support

import io.cucumber.java.ParameterType
import io.cucumber.shouty.Person

class ParameterTypes {
    @ParameterType(value = "Lucy|Sean")
    fun person(name: String): Person {
        return Person(name)
    }
}