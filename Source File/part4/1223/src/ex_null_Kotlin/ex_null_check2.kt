package ex_null_Kotlin


/*
    Null 확인은 if-else밖에 안되지만 if-else으로 확인하는 것은 귀찮다.
    이 방법으로 null을 확인을 할 수 있지만 보다 더 확실하고 간단한 방법은 다음과 같다.
    ?.을 사용하면 null체크를 쉽게 할 수있다.
 */
fun main() {
    var data1: String? = "simyoung"

    var length2: Int? = data1?.length
    println(length2)

    data1=null
    length2 = data1?.length
    println(length2)
}