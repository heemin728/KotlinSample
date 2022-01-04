package com.example.kotlinsample

class Person(val name:String) {

    var age:Int=0
    var nickname:String=""
    set(value){
        field=value.lowercase()
    }

   /* var age:Int=0
    lateinit var name:String
    constructor(name:String){
        this.name=name
    }
*/
}