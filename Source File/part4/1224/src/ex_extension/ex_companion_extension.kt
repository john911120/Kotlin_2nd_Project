package ex_extension

/*
    companion object extension
 */

class Test2 {
    companion object{
        val data1: Int = 10
        fun myFun(){
            println("Companion Object myFun()...")
        }
    }
}
val Test2.Companion.data2: Int
    get() = 20

fun Test2.Companion.myFun2() {
    println("extension myFun2()...")
}

fun main() {
    println("data1 : ${Test2.data1}... data2 : ${Test2.data2}")
    Test2.myFun()
    Test2.myFun2()
}