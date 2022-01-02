package com.example.kotlinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinsample.databinding.ActivityMainBinding

/**
 * 함수 선언할 때 fun 키워드 사용
 * void 생략
 * args:Array<String>
 */
class MainActivity : AppCompatActivity() { // :는 자바에서 extends 와 같음
    override fun onCreate(savedInstanceState: Bundle?) { // ? 는 null 가능 여부
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener{
            //Intent 로 BmiJavaActivity 를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity,BmiJavaActivity::class.java))
        }

        binding.button2.setOnClickListener{
            startActivity(Intent(this@MainActivity,BmiKotlinActivity::class.java))
        }
    }
}