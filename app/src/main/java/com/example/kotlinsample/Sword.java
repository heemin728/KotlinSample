package com.example.kotlinsample;

// final이라 상속 불가 -> 데코레이터 패턴 사용
// sword 클래스의 메소드를 전부 포함하는 인터페이스를 만들고 상속
public final class Sword implements ISword {
    String name;

    public Sword(String name){
        this.name=name;
    }

    public void equip(){
        System.out.println(name+"이 장착되었습니다.");
    }

}
