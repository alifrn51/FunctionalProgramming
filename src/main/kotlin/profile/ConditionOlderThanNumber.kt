package org.example.profile

class ConditionOlderThanNumber(val number: Int): Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.age > number
    }

}