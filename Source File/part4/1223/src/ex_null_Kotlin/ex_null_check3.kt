package ex_null_Kotlin


/*
    ?.을 이용한 null을 체크한다. = 객체의 연결 구조
    실습을 위해 Address, User 라는 클래스를 만든다.
    null일 때 특정 값을 지정하는 용도로 사용되며 특정 구문이 실행되게 할 수 있다.
 */

class Address {
    val city: String? = "seoul"
}

class User {
    val address: Address? = Address()
}

fun main() {
    val user: User? = User()

    println(user?.address?.city)
}