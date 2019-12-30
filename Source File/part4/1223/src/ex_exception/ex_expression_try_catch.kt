package ex_exception

import java.lang.Exception

// try_catch구문을 표현식으로도 사용이 가능하다.
// 예외처리하고 결과값을 반복하는 용도로 사용이 가능하다. 그렇게 되면 try-catch는 각 영역의 마지막줄이 반환값이 된다.

fun some1(arg: String): Int{
    val parseData : Int =

    try{
        println("try...top")
        arg.toInt()
    } catch(e: Exception){
        println("${e.toString()}")
        0
    } finally {
        println("finally...")
        100
    }
    return parseData
}
fun main() {
    println("${some1("10")}")
    println("${some1("a")}")
}