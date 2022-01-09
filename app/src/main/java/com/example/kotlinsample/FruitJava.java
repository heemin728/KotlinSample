package com.example.kotlinsample;

public class FruitJava {
    String fruitName;
    String description;
    @Override
    public String toString(){
        return "fruitJava("+fruitName+", "+description+")";
    }
    @Override
    public boolean equals(Object obj){
        // 먼저 같은 클래스인지 확인
        if(obj instanceof FruitJava){
            FruitJava another=(FruitJava) obj;

            // 모든 필드가 같다면 같은 객체로 취급
            return fruitName.equals(another.fruitName)&&description.equals(another.description);
        }
        return false;
        // 클래스가 다르다면 서로 다른 객체
    }
    @Override
    public int hashCode(){
        // 객체가 같으면 해시코드도 같아야 함
        // 즉 fruitName, description 이 같으면 같은 해시코드 반환
        int hash=7;
        hash=hash*31+(fruitName==null ? 0 : fruitName.hashCode());
        hash=hash*31+(description==null ? 0 : description.hashCode());
        return hash;
    }

}
