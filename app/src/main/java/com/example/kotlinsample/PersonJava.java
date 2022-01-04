package com.example.kotlinsample;

import java.util.Locale;

public class PersonJava {

    private int age;
    private String name;
    private String nickname;

    public PersonJava(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setNickname(String nickname){
        this.nickname=nickname.toLowerCase();
    }
    public String getNickname(){
        return nickname;
    }
}
