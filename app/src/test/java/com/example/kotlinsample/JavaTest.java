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
}
