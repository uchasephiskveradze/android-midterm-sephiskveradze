package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class WealthManagerTest {

    @Test
    fun testKCoefficientCalculation() {
        // Name: Ucha (4), Surname: Sephiskveradze (14), Day: 3
        // (4 + 14) / 3 = 18 / 3 = 6.0
        val manager = WealthManager("Ucha", "Sephiskveradze", 3)
        assertEquals(6.0, manager.kCoefficient, 0.01)
    }

    @Test
    fun testCalculateSavings() {
        val manager = WealthManager("Ucha", "Sephiskveradze", 3)
        val income = 1000.0
        val expenses = 500.0
        // (1000 - 500) * 6.0 = 3000.0
        val expected = 3000.0
        assertEquals(expected, manager.calculateSavings(income, expenses), 0.01)
    }
}