package com.example.kotlinsample

// String 클래스에 lastString 확장함수를 추가로 정의
fun String.lastString():String{
    return this.get(this.length-1).toString()
}
// lastString 함수를 원래 string 클래스에 있는 메소드처럼 사용 가능

class ExtTest{
    // String 클래스에 extFunc 이라는 확장함수 추가
    fun String.exFunc(){
        println(this.lastString())
    }

    fun method1(){
        // 확장함수 String.exFunc 에 접근 가능
        "Test".exFunc()
    }

    fun test(){
        // String.lastString 에는 접근 가능
        "test".lastString()
        // 확장함수 String.extFunc() 에는 접근 불가
        // "test".exFunc()

    }
}
