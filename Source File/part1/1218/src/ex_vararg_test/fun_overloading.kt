package ex_vararg_test

/*
fun varargsFun(data1 : Int)
{

}

fun varargsFun(data1: Int, data2 : Int) {

}

// 이렇게 매개변수가 10개 이상 선언을 해야하게 된다면 소스코드가 지저분해질 수있다.
// 가변 인수를 사용하면 매개 변수 10개 이상 선언을 하는 것이 쉬워질 수 있다.
// 가변 인수는 명시적으로 타입을 지정하는 방법이 아니므로 제네릭 기능을 사용해야한다.
  제네릭에 대해서 가볍게 언급을 하면 하나의 매개타입의 타입을 고정시키기 어려워서 임의의 타입으로 선언되기 위해 사용되는 기능이다.
  여기에서 사용한 제네릭 기능은 Int를 고정시키기 어려워서 임의의 타입을 선언하기 위해 사용되었다.
*/

fun <T> varargsFun(a1 : Int, vararg Array : T) {
    for(a in Array) {
        println(a)
    }
}

fun main() {
    varargsFun(10, "hello","world")
    varargsFun(10,20, false)
}