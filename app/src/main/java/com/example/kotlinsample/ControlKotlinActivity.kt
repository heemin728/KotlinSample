package com.example.kotlinsample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinsample.databinding.LayoutControlBinding

class ControlKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_control)
        var binding=LayoutControlBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button7.setOnClickListener{
            val number=binding.numberField.text.toString().toInt()

            when {
                number % 2 == 0 -> Toast.makeText(applicationContext, "${number}는 2의 배수입니다.", Toast.LENGTH_SHORT).show()
                number % 3 == 0 -> Toast.makeText(applicationContext, "${number}는 3의 배수입니다.", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(applicationContext, "${number}", Toast.LENGTH_SHORT).show()
            }
            when(number){
               in 1..4 -> binding.button7.text="실행 -4"
                9,18 -> binding.button7.text="실행 -9"
                else -> binding.button7.text="실행"
            }
        }
    }
}