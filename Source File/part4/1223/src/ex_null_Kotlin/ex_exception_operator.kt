package ex_null_Kotlin

// !!는 null이면 예외를 발생시킨다. NPE를 발생하지 않도록 작성하는 것도 좋지만..
// 때로는 NPE를 발생 시켜야하는 경우도 있다. 그 때 사용하는 연산자가 !!이다.
/*
    만약 이 프로퍼티에 정상적인 데이터가 대입되었다면 !!에 의해서 아무 일도 발생되지 않는다.
    하지만 null이 대입되어있다면 NPE가 발생한다.
 */


fun main() {
    var data: String? = "hoob"

    data!!.length

    data = null

    data!!.length
}