package ex_operator

// 일반 연산자(일반 객체 일치)
fun main() {
    class User
    val User1 = User()
    val User2 = User()
    val User3 = User1
    println("user1 == user2 is ${User1 == User2}")
    println("user1 === user2 is ${User1 === User2}")
    println("user1 == user3 is ${User1 == User3}")
    println("user1 === user3 is ${User1 === User3}")
}