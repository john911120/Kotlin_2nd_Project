package ex_operator_fun


// 연산자 재정의 - 연산자에 대응하는 함수를 재정의하는 개념인데 클래스의 멤버로 정의가 가능하고 확장함수로 추가해서 사용이 가능하다.
// 앞에는 항상 operator라는 키워드를 붙여줘야한다.
fun main() {
    val a : Int = 10

    val b : Int = 5

    val result1: Int = a + b
    val result2: Int = a.plus(b)

    println("result1: $result1 ... result2: $result2")
}