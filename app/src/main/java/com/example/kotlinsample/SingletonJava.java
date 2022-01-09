package com.example.kotlinsample;

public class SingletonJava {
    // 생성자를 private 로 감춘다.
    private SingletonJava(){}

    // 생성된 객체를 private 로 감추고 프로그램 시작할 때 초기화함.
    private static SingletonJava instance=new SingletonJava();

    // 외부에서 생성된 instance 에서 접근할 수 있는 방법을 제공
    public static SingletonJava getInstance(){
        return instance;
    }

    public void log(String text){
        System.out.println(text);
    }
}
