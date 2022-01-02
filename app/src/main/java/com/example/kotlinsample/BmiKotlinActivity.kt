package com.example.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinsample.databinding.LayoutViewBindingBinding

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        var binding3=LayoutViewBindingBinding.inflate(layoutInflater)
        setContentView(binding3.root)

        binding3.bmiButton.setOnClickListener{
            val tall=binding3.tallField.text.toString().toDouble()
            val weight=binding3.weightField.text.toString().toDouble()
            val bmi=weight/Math.pow(tall/100,2.0)

            binding3.resultLabel.text="키: ${binding3.tallField.text}, 체중: ${binding3.weightField.text},BMI: $bmi"
        }
    }
}