package com.example.kotlinsample

import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun test1(){
        Assert.assertEquals(4,2+2)
    }

    @Test
    fun testGetterSetter(){
        val person=Person("john")
        person.age=20
        Assert.assertEquals(20,person.age)
        Assert.assertEquals("john",person.name)
    }
    @Test
    fun testSetNickname(){
        val person=Person("john")
        person.nickname="BANAna"
        Assert.assertEquals("banana",person.nickname)
    }
    @Test
    fun testUser(){
        val user=User()
        user.nickname="death note"
        Assert.assertEquals("DEATH NOTE",user.nickname)
    }
    @Test
    fun testUserLazy(){
        val user=User()
        println("not init")
        // 초기화 순서를 확인하기 위해 프린트 추가
        Assert.assertNotNull(user.httpText)
        // 불리는 시점에서는 초기화가 되어 NULL 이 아니게 된다.
    }

    @Test
    fun testUserNameObservable(){
        val user=User()
        user.name="john"
        user.name="james"
    }

    @Test
    fun testAnimalByMap(){
        val animal=Animal(mutableMapOf(
            "name" to "cat",
            "age" to 20
        ))
        //name 속성이 map 객체에 정상적으로 위임되었는지 확인
        Assert.assertEquals("cat",animal.name)
        Assert.assertEquals(20,animal.age)

        animal.age=21
        animal.name="dog"

        //map 의 값이 바뀌었는지 확인
        Assert.assertEquals("dog",animal.map["name"])
        Assert.assertEquals(21,animal.map["age"])

    }


}