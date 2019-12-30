package ex_annotation

annotation class ex_TestAnnotation

@TestAnnotation
class Test{
    @TestAnnotation
    val myVal: String = "hello"

    @TestAnnotation
    fun myFun(){

    }
}