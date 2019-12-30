package ex_annotation

/*
    어노테이션은 클래스 몸체인을 가지지 못한다고 했는데 1.3버전에서는 사용이 가능하다.
    원래는 클래스내에 프로퍼티나 함수를 추가가 안된다는 의미이다.
    어노테이션의 목적은 어노테이션 클래스 자체에 있는 것이 아니라 다른 클래스, 함수, 프로퍼티에
    추가해서 부가정보를 달 수 있다.
 */

annotation class TestAnnotation

annotation class TestAnnotation2 { }

fun main() {
    // val obj: TestAnnotation = TestAnnotation()
}