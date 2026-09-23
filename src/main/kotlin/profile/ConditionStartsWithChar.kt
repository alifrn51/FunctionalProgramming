package org.example.profile

class ConditionStartsWithChar(val char: Char): Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.firstName.startsWith(char = char)
    }
}