package ex_null_Kotlin

/*
    null을 불허로 선언한 프로퍼티에 null을 대입했으므로 컴파일 에러가 발생한다.
 */

var data1: String = "park"

var data2: String? = null

fun main() {
   data2="hello"

    val data3: String? = data1
    /*
    NonNullable로 선언한 프로퍼티를 Nullable으로 선언한 것은 상관없지만 nullable으로 선언한 프로퍼티를 NonNullable한
    프로퍼티에 대입하면 에러가 발생한다.

    val data4: String = data2
    myFun(data2)
     */
}