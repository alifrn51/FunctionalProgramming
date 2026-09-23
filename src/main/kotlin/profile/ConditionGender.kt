package org.example.profile

class ConditionGender(val gender: Gender): Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.gender == gender
    }
}