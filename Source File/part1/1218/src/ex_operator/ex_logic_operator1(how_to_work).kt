package ex_operator

fun main() {
    fun trueFun():Boolean {
        println("call.. trueFun()")
        return true
    }

    fun falseFun():Boolean{
        println("call..falseFun()")
        return false
    }

    println("trueFun() && trueFun() : ")
    trueFun() && trueFun()
    println("falseFun() && trueFun() : ")
    trueFun() && falseFun()
    println("falseFun() || trueFun() : ")
    falseFun() || trueFun()
    println("trueFun() || trueFun() : ")
    trueFun() || trueFun()
}