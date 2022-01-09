package com.example.kotlinsample

class Truck(val id:Int, val name:String) {
    // equals 를 오버라이딩. id 가 같으면 같은 객체 취급
    override fun equals(other:Any?):Boolean{
        // as? 연산자를 이용하면 타입이 같은 경우 캐스팅이 정상적으로 되고
        // 캐스팅이 실패하면 null 반환
        // null 이 반환된 경우 엘비스 연산자의 디폴트 식이 실행- false 리턴
        val otherTruck=other as? Truck ?: return false

        // otherTruck 은 스마트캐스팅 - 널을 신경쓸 필요 x
        return otherTruck.id==id
    }
}