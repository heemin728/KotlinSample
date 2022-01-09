package com.example.kotlinsample

// 코틀린은 기본적으로 null X..
class NPEKotlin {
    fun strLenNonNull(str : String) : Int{
        // 파라미터로 받은 str은 널이 될 수 없으므로 안전
        return str.length;
    }

    // 널 가능성이 있다면 타입에 ? 를 붙여야 함
    fun strLenNullable(str:String?):Int{
       // 널 가능성이 있는 str 메소드에 접근하면 에러 발성
       // return str.length;
        return 0;
    }

    fun strLastCharNullable(str:String?):Char?{
        // ?. 연산자는 str 이 Null 이면 Null 반환
        return str?.get(str.length-1)
    }

    fun strLastCharNullable2(str:String?):Char?{
        return str?.get(str.length-1) ?: "".single()
        // ?: 연산자를 이용해 str 이 널이면 "".single() 이 반환됨
    }

    fun strPrintLen(str:String?){
        // let 함수는 수신객체인 str 이 널이면 실행되지 않음
        str?.let{print(strLenNonNull(it))}
    }

}