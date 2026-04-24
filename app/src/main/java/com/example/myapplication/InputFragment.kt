package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.textfield.TextInputEditText

class InputFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_input, container, false)

        val etIncome = view.findViewById<TextInputEditText>(R.id.us_dze_et_income)
        val etExpenses = view.findViewById<TextInputEditText>(R.id.us_dze_et_expenses)
        val btnSave = view.findViewById<Button>(R.id.us_dze_btn_save)

        btnSave.setOnClickListener {
            val incomeStr = etIncome.text.toString()
            val expenseStr = etExpenses.text.toString()

            // Basic input validation
            if (incomeStr.isEmpty()) {
                etIncome.error = "Please enter income"
                return@setOnClickListener
            }
            if (expenseStr.isEmpty()) {
                etExpenses.error = "Please enter expenses"
                return@setOnClickListener
            }

            val income = incomeStr.toDouble()
            val expenses = expenseStr.toDouble()

            // Calculate data using WealthManager
            val manager = WealthManager("Ucha", "Sephiskveradze", 3)
            val savings = manager.calculateSavings(income, expenses)
            val k = manager.kCoefficient

            // Hide keyboard
            val imm = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)

            // Send results to AnalyticsFragment
            setFragmentResult("wealth_data", bundleOf(
                "SAVINGS" to savings,
                "K_VALUE" to k
            ))
            
            Toast.makeText(requireContext(), "Data saved!", Toast.LENGTH_SHORT).show()
            
            // Switch to Analytics tab
            activity?.findViewById<ViewPager2>(R.id.us_dze_view_pager)?.currentItem = 1
        }

        return view
    }
}