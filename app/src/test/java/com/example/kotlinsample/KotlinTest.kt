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
    @Test
    fun testFruit(){
        val fruit1=Fruit("바나나","바나나 길어")
        val fruit2=Fruit("바나나","바나나 길어")

        // toString 테스트
        println(fruit1)
        println(fruit2)

        // 두 객체가 같은지 비교. equals 호출
        Assert.assertEquals(fruit1,fruit2)

        // 두 객체의 해시코드 비교
        Assert.assertEquals(fruit1.hashCode(),fruit2.hashCode())
    }

    @Test
    fun testLambda(){
        // 함수의 파라미터로 람다식 전달
        println(sum(1,2))
        // 람다식 변환 값으로 비교
        Assert.assertEquals(4,sum(1,3))

        //함수에 람다 표현식을 바로 전달
        Assert.assertEquals(4,{x:Int, y:Int -> x*y})

        // 람다표현식 내부에서 람다표현식을 반환
        val exp={x:Int, y:Int -> {z:Int -> (x+y)*z}}
        val exp2=exp(3,2)
        val result=exp2(4)
        Assert.assertEquals(20,result)
    }
    @Test
    fun testCollectionApi(){
        // 컬렉션을 만든다.
        val list=listOf(1,"2",3,4,5.7,1,2)

        //filter : 컬렉션에서 특정 조건이 맞는 학몽만 추출하여 새로운 컬렉션을 만든다 -> Int 타입만 추출
        println(list.filter{item->item is Int})

        // 람다 표현식에서는 파라미터가 하나인 경우 생략이 가능
        // 파라미터는 it 키워드로 접근 가능
        println(list.filter{it is Int})

        // map: 컬렉션에서 아이템을 변환하여 새로운 컬렉션 생성.
        println(list.map{"value: ${it}"})

        // filter 에서 반환된 컬렉션을 map 으로 반환
        println(list.filter{it is Int}.map{"value : ${it}"})

        // 아이템 찾기
        println(list.find{it is Double})

        // 컬렉션을 그룹화하여 Map<String,List<T>> 형태로 만듦.
        val map=list.groupBy { it.javaClass }
        println(map)

        //  컬렉션 안에 컬렉션이 있는 새로운 리스트
        val list2=listOf(listOf(1,2),listOf(3,4))
        println(list2)

        // flatmap 으로 리스트를 평평학 만들고 반환
        println(list2.flatMap { it.toList() })
    }
}