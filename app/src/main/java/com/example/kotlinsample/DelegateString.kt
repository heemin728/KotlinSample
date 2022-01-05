package com.example.kotlinsample

import kotlin.reflect.KProperty

class DelegateString {
    var text=""
    // Setter 에서 호출된 값을 저장할 변수

    operator fun getValue(thisRef:Any?, property:KProperty<*>):String{
        return text
    }
    operator fun setValue(thisRef:Any?, property: KProperty<*>,value:String){
        text=value.uppercase()
        println("$value ==> ${text}")
    }
}