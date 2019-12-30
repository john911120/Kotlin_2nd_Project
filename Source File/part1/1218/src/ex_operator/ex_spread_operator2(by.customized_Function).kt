package ex_operator

/*
    *은 곱하기 연산자이지만 코틀린에서는 전개 연산자로 사용이 된다.
    * 전개 연산자는 배열값을 나열할 때 사용하는 기능이다.
    * asList함수는 라이브러리에서 제공한 함수 이외에도 사용자가 직접 정의한 함수를  이용할 때도 사용이 가능하다.
    * 전개 연산자로 호출할 함수는 매개변수는 vararg으로 선언해야한다.
 */
fun some(vararg a: String) {
    val iterator = a.iterator()
    while(iterator.hasNext()){
        println(iterator.next())
    }
}

fun main(args: Array<String>)
{
    val array3 = arrayOf<String>("hello","world")
    some(*array3)
}