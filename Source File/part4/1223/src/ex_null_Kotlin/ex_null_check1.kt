package ex_null_Kotlin


/*
    Null 확인은 if-else밖에 안되지만 if-else으로 확인하는 것은 귀찮다.
    이 방법으로 null을 확인을 할 수 있지만 보다 더 확실하고 간단한 방법은 다음과 같다.
 */
fun main() {
    var data1: String? = "simyoung"

    val length1: Int? = if(data1 != null){
        data1.length
    } else {
        null
    }
}