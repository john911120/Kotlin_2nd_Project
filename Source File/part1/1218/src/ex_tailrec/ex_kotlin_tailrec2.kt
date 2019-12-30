package ex_tailrec

/*
    tailrec을 사용할 때 주의점이 있다.
    자신을 다시 호출 하는 구문은 함수의 맨 마지막 작업으로 작성해야한다.
 */

tailrec fun sum(n: Int): Int {
    if(n <= 0) return n
    else return n + sum (n - 1)
}

tailrec fun sum2(n: Int, result: Int = 0): Int {
    if(n <= 0) return result
    else return sum2(n - 1, n + result)
}

fun main()
{
    println(sum(3))
    println(sum2(3))
}
