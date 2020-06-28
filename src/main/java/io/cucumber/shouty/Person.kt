package io.cucumber.shouty

class Person {
    private val _messagesHeard = mutableListOf<String>()
    val messagesHeard: List<String> = _messagesHeard

    fun moveTo(distance: Int?) = Unit
    fun show(message: String?) = Unit

    fun heard(message: String) {
        _messagesHeard.add(message)
    }
}