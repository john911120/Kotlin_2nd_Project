package ex_nested_class

// Nested 클래스 기본형
class Outer{
    class Nested{
        val name: String = "park"
        fun myFun(){
            println("Nested Class & myFun ")
        }
    }
}

fun main() {
    val obj: Outer.Nested = Outer.Nested()
    println("${obj.name}")
    obj.myFun()
}