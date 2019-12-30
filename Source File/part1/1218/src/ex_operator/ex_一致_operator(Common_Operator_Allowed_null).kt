package ex_operator

// 일반 연산자(일반 객체  null 허용)
fun main() {
    class User
    val User4 = User()
    val User5: User? = User4
    println("user4 == user5 is ${User4 == User5}")
    println("user4 === user5 is ${User4 === User5}")

}