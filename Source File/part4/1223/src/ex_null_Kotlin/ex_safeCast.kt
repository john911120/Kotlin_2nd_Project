package ex_null_Kotlin

/*
    타입 캐스팅에는 스마트 캐스팅과 명시적 캐스팅으로 나뉘는데
    명시적 캐스팅은 as를 이용하는데 as연산자를 이용 할 때 캐스팅이 안될 때는 ClassCastException이 발생한다.
    이 예외는 프로그램이 실행될 때 에러가 발생한다. 그런데 이 예외가 발생해야하는 상황에 에러 없이 null이
    생기게 할 수 있다. 이 때 as?라는 키워드를 사용하게 되면 안전하게 캐스팅이 된다.
 */

fun main() {
    val strData: String = "hoob"

    val intData : Int? = strData as? Int

    println(intData)
}