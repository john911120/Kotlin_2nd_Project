package ex_extension

/*
    상속에 의한 기능 추가하기
 */

open class ex_extension1 {
    val superData: Int = 10
    fun superFun(){
        println("superFun...")
    }
}

class Sub: ex_extension1(){
    val subData: Int = 20
    fun subFun() {
        println("subFun...")
    }
}

fun main() {
    val obj: Sub = Sub()
    println("superData : ${obj.superData}, subData : ${obj.subData}" )
    obj.superFun()
    obj.subFun()
}