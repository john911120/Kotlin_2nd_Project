package ex_extension

/*
    확장에 의한 클래스 확장 구현
 */

open class ex_extension5

class sub0 : ex_extension5()

fun ex_extension5.sayHello(){
    println("Super....SayHello()")
}

fun sub0.sayHello(){
    println("Sub.. sayhello()")
}

fun some(obj: ex_extension5) {
    obj.sayHello()
}

fun main() {
    some(ex_extension5())
}
