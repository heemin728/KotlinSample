package com.example.kotlinsample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinsample.databinding.LayoutVariableBinding
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {

    var clickCount=0
    val startTime=System.currentTimeMillis()


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_variable)

        var binding4=LayoutVariableBinding.inflate(layoutInflater)
        setContentView(binding4.root)

        val textTime=SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)

        binding4.startTimeLabel.text="Activity 시작 시간 : ${textTime}"
        binding4.clickCountLabel.text="버튼이 클릭된 횟수 ${clickCount}"

        binding4.button5.setOnClickListener{
            clickCount++
            binding4.clickCountLabel.text="버튼이 클릭된 횟수 : ${clickCount}"
        }

        binding4.button6.setOnClickListener{
            clickCount=0
            binding4.clickCountLabel.text="버튼이 클릭된 횟수 : ${clickCount}"
        }

    }
}