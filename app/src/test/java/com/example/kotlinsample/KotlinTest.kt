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

}