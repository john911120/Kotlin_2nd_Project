package ex_extension

/*
    같은 이름의 함수를 확장하기
    클래스 내부에 선언된 함수가 우선시된다.
 */


class Test {
    fun sayHello(){
        println("Test... SayHello()")
    }
}

fun Test.sayHello(){
    println("Test....extension sayHello()")
}

fun main() {
    val test = Test()
    test.sayHello()
}