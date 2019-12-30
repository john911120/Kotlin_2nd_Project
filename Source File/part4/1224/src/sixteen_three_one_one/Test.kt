package sixteen_three_one_one

/*
    최상위 레벨에 작성하기
    (최상위 레벨에 선언한 확장 함수나 프로퍼티를 같은 파일에서 사용하는 것은 문제 없지만
    외부파일에서 이용할 때는 별도의 import를 받아서 써야한다.)
    예시로 sixteen_three_one_one // sixteen_three_one_two라는 두 패키지를 만들었다.
 */

class Test {
    val data1: Int = 10
}

val Test.data2
    get() = 20

fun main() {
    val obj: Test = Test()
    println("data2 : ${obj.data2}")
}