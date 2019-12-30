package ex_extension

/*
    프로퍼티 확장
 */

class Test1 {
    val classData : Int = 0
}
// 확장 프로퍼티는 extensionData2 처럼 반드시 get함수로 초기화해야한다.
val Test1.extensionData1: Int
    get() = 10

val Test1.extensionData2: Int
    get() = 10

fun main() {
    val obj = Test1()
    println("classData ${obj.classData} ... extensiondata2 : ${obj.extensionData2}")
}