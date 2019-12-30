package sixteen_three_one_two

import sixteen_three_one_one.Test
import sixteen_three_one_one.data2

/*
    Test를 임포트했다고 외부엥 선언된 Test의 확장함수나 프로퍼티까지 임포트 되지 않는다.
    그래서 별도로 import를 해와야 에러가 안난다.
 */

fun main() {
    val obj: Test = Test()
    println("data1 : ${obj.data1}")
    println("data2 : ${obj.data2}")
}