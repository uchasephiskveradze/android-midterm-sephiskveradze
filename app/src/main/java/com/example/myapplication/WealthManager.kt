package com.example.myapplication

class WealthManager(private val name: String, private val surname: String, private val birthDay: Int) {

    // Calculate K coefficient
    val kCoefficient: Double
        get() = (name.length + surname.length).toDouble() / birthDay

    // Calculate final savings
    fun calculateSavings(income: Double, expenses: Double): Double {
        return (income - expenses) * kCoefficient
    }
}