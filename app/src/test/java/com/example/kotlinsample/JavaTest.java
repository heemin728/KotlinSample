package com.example.kotlinsample;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {
    @Test
    public void test1(){
        Assert.assertEquals(4,2+2);
    }
    @Test
    public void testGetterSetter(){
        PersonJava personJava=new PersonJava("john");
        personJava.setAge(20);

        Assert.assertEquals(20,personJava.getAge());
        Assert.assertEquals("john",personJava.getName());

        Person person=new Person("heemin");
        person.setAge(23);
        Assert.assertEquals(22,person.getAge());
        Assert.assertEquals("heemin",person.getName());

        //코틀린으로 작성된 getter 과 setter 를 선언하지 않았지만 자동생성된 것을 확인
    }
    @Test
    public void testSetNickname(){
        Person personJava=new Person("john");
        personJava.setNickname("APple");
        Assert.assertEquals("apple",personJava.getNickname());

        Person person=new Person("john");
        person.setNickname("APPLe");
        Assert.assertEquals("apple",person.getNickname());
    }
    @Test
    public void testSingletonJava(){
        // 생성자를 private 로 감췄기 때문에 new 로 생성불가 - 주석을 풀면 에러
        // SingletonJava singletonJava=new SingletonJava();

        // 외부에 공개된 getInstance() 메소드로 객체에 접근
        SingletonJava singletonJava=SingletonJava.getInstance();
        singletonJava.log("hi, singleton");
    }
    @Test
    public void testFruit(){
        FruitJava fruitJava=new FruitJava();
        fruitJava.fruitName="사과";
        fruitJava.description="사과는 맛있다";
        // 객체를 넘기면 자동으로 toString(); 메소드 실행
        System.out.println(fruitJava);
        // 오버라이딩 하지 않으면 클래스 이름과 해시코드 반환.
    }
    @Test
    public void testFruitEquals(){
        FruitJava fruitJava1=new FruitJava();
        FruitJava fruitJava2=new FruitJava();

        fruitJava1.fruitName="바나나";
        fruitJava2.fruitName="바나나";

        fruitJava1.description="바나나는 길다";
        fruitJava2.description="바나나는 길다";

        Assert.assertEquals(fruitJava1,fruitJava2);
    }
    @Test
    public void testFruitHashCode(){
        FruitJava fruitJava1=new FruitJava();
        FruitJava fruitJava2=new FruitJava();

        fruitJava1.fruitName="바나나";
        fruitJava2.fruitName="바나나";

        fruitJava1.description="바나나는 길어";
        fruitJava2.description="바나나는 길어";

        Assert.assertEquals(fruitJava1.hashCode(),fruitJava2.hashCode());
    }
    @Test
    public void testExtFunc(){
        // 자바에서 코틀린의 확장함수 호출 방법은 최상위 함수 호출 방법과 같음
        String lastString=StringExtKt.lastString("apple");
        Assert.assertEquals("e",lastString);
    }
    @Test
    public void testNPE1(){
        NPE npe=new NPE();
        // 3글자 단어를 함수에 전달
        Assert.assertEquals(3,npe.strLen("abc"));
        // null 을 전달
        Assert.assertEquals(0,npe.strLen(null));
        // 예외 발생

        // null 은 String 타입 변수에 할당할 수는 있찌만, String 타입은 아님.

    }
    @Test
    public void testNullType(){
        Assert.assertEquals(true, null instanceof String);
    }
}
