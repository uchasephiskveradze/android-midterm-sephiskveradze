package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import java.text.NumberFormat
import java.util.Locale

class AnalyticsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_analytics, container, false)

        val tvSavings = view.findViewById<TextView>(R.id.us_dze_tv_savings_result)
        val tvKValue = view.findViewById<TextView>(R.id.us_dze_tv_k_value)

        // Listen for data results
        setFragmentResultListener("wealth_data") { _, bundle ->
            val savings = bundle.getDouble("SAVINGS")
            val k = bundle.getDouble("K_VALUE")

            tvSavings.text = NumberFormat.getCurrencyInstance(Locale.US).format(savings)
            tvKValue.text = "K Coefficient: %.2f".format(k)
        }

        return view
    }
}