package ex_extension

/*
    클래스 확장 에 의한 기능 추가하기
 */
class Super {
    val superData: Int = 10
    fun superFun() {
        println("superFun...")
    }
}

val Super.subData : Int
    get() = 20

fun Super.subFun() {
    println("subFun...")
}

fun main() {
    val obj: Super = Super()
    println("superData : ${obj.superData}, subData : ${obj.subData}" )
    obj.superFun()
    obj.subFun()
}