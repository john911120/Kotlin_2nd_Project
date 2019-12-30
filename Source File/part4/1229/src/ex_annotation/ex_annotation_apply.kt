package ex_annotation

/*
    클래스 주 생성자를 선언할 때 constructor생략이 가능하다.
    또한 프로퍼티는 getter/setter를 추가 할 수 있는데 이 앞에도 어노테이션을 추가할 수 있으며
    람다함수에도 추가가 가능하다.
 */

annotation class ex_annotation_apply

class Test2 @TestAnnotation constructor( ) {
    @TestAnnotation
    val myVal: Int = 10

    var myVal2: Int = 10
        @TestAnnotation set(value) {field = value}
    val myFun = @TestAnnotation{

    }
}