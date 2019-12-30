package ex_operator

// 기초 데이터 타입 객체(Integer)
fun main() {
    val int1 = Integer(10)
    val int2 = Integer(10)
    val int3 = int1
    println("int1 == int2 is ${int1 == int2}")
    println("int1 === int2 is ${int1 === int2}")
    println("int1 == int3 is ${int1 == int3}")
    println("int1 === int3 is ${int1 === int3}")

    //기초 데이터 타입 객체(Int)
    val data1: Int = 10
    val data2: Int = 10
    println("data1 == data2 is ${data1 == data2}")
    println("data1 === data2 is ${data1 === data2}")
}