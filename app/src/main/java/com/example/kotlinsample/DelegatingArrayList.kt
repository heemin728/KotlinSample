package com.example.kotlinsample

class DelegatingArrayList<T>(val innerList:MutableCollection<T> = mutableListOf()):MutableCollection<T> by innerList{
    override fun add(element: T):Boolean{
        printItem(element)
        return innerList.add(element)
    }
    fun printItem(item:T){
        println(item.toString())
    }
}