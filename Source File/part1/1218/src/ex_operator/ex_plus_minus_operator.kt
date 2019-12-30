package ex_operator

// 증감 연산자
/*
fun main() {
    var data = 10
    var result1 = data++
    println("result = $result1, data = $data")
}
*/
// 7번째 줄의 코드 작동 원리
fun main() {
    var data = 10
    var result1 = data++
    println("result = $result1, data = $data")

    var data2 = 10
    var result2 = data2
    data2 = data2 + 1
    println("result2 = $result2, data2 = $data2")

    // 증감 연산자의 위치에 따라 값은 달라진다.
    var data3 = 10
    var result3 = ++data3
    println("result3 = $result3, data3 = $data3")

    // 작동 원리
    var data4 = 10
    data4 = data4 + 1
    var result4 = data4
    println("result4 = $result4, data4 = $data4")
}