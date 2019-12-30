package other_class1

/*
    디스패치 리시버 내에 선언된 익스텐션 리시버의 확장 함수는 디스패치 리시버와 익스텐션
    리시버 내의 함수에 모두 접근이 가능하다.
    그런데 some2()에러 에러가 발생하는 것은 왜일까? 그저 some2()는 클래스 확장한 건데
    에러가 발생이 되었다. 그 이유는 확장 구문이 내부에 정의 된 것이어서 extenstion_receiver1 내부에서만 확장 함수가
    적용되지 extenstion_receiver1외부까지는 적용이 되지 않는다.
*/
class extension_receiver {
    fun some1() {
        println("ExtensionClass some1()")
    }
}

class extension_receiver1{
    fun dispatchFun(){
        println("DispatchClass dispatchFun()")
    }
    fun extension_receiver.some2(){
        some1()
        dispatchFun()
    }

    fun test() {
        val obj: extension_receiver = extension_receiver()
        obj.some1()
        obj.some2()
    }
}

fun main() {
    val obj: extension_receiver = extension_receiver()
    obj.some1()
    //obj.some2()
}