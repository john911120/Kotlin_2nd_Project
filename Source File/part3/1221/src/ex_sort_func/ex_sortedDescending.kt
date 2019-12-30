package ex_sort_func

fun main() {

    // sortedDescending, sortedDescendingBy는 앞에 사용된 함수와 동일하지만
    // 정렬이 역순이다. 숫자 값을 정렬하면 큰 수에서 작은 수 순서로 정렬이 되고 문자열은 z에서 a순으로 정렬된다.
    /*listOf("rynn","no","inu").sortedDescending()
        .forEach { print(it) }

     */
    listOf(4,7,1).sortedDescending()
        .forEach { println(it) }
}
