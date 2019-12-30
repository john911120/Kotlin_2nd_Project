package ex_extension

/*
    상속을 통해서 클래스의 다형성을 구현
 */

open class ex_extension4{
    open fun sayhello(){
        println("Super1... sayHello()")
    }
}

class sub : ex_extension4(){
    override fun sayhello() {
        println("Sub1... sayHello()")
    }
}

fun some(obj: ex_extension4) {
    obj.sayhello()
}

fun main() {
    some(ex_extension4())
}
