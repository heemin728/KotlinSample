package com.example.kotlinsample

import java.io.InputStreamReader
import java.net.URL
import kotlin.properties.Delegates

class User {
    var nickname by DelegateString()
    // 닉네임은 DelegateString 클래스에 위임

    val httpText by lazy{
        println("lazy init start")
        InputStreamReader(URL("https://www.naver.com").openConnection().getInputStream()).readText()
    }
    // lazy 위임은 val 키워드로 선언해야 함
    // 네트워크에서 받은 텍스트는 시간이 걸리므로 실제로 사용할 때 초기화

    var name:String by Delegates.observable(""){
        property,oldValue,newValue->
        println("기존값:${oldValue}, 새로 적용될 값:${newValue}")
    }
}