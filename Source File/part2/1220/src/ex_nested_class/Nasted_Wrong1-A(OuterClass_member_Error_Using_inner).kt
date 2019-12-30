package ex_nested_class

// Outer 클래스 멤버 접근 에러

/*
 프로퍼티와 함수는 Nested 클래스에 성언된 멤버가 아니라 Outer 클래스에 선언된 멤버이다.
 Nested 클래스에서 Outer클래스의 멤버르 사용하려면 Nested 클래스 선언할 때 inner 라는 예약어를 추가해야한다.
 */
class Outer1{
    private var no: Int = 10
    fun outerFun() {
        println("OuterFun()...")
    }
    inner class Nasted{
        val name: String = "lee";
        fun myFun(){
            println("Nested... myFun")
            no = 20
            outerFun()

        }
    }
}

fun main() {
    val obj: Outer.Nested = Outer.Nested()
    println("${obj.name}")
    obj.myFun()
}