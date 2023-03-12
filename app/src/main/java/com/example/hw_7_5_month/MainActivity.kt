package com.example.hw_7_5_month

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_7_5_month.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
        initDivide()
    }

    private fun initDivide() {
        with(binding) {
            btnCalculateDivide.setOnClickListener {
                tvResult.text =
                    Math().divide(etFirst.text.toString(), etSecond.text.toString())
            }
        }
    }


    private fun initClicker() {
        with(binding) {
            btnCalculate.setOnClickListener {
                tvResult.text = Math().add(etFirst.text.toString(), etSecond.text.toString())
            }
        }
    }
}

