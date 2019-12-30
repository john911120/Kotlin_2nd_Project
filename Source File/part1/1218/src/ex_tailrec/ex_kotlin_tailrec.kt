package ex_tailrec

/*
    tailrec이라는 키워드를 앞에 붙여주기만 하면 효율적으로 재귀함수를 만들 수 있다.
    tail recursion 즉, 꼬리 재귀함수라는 약어이다.
    일반적인 재귀함수와 차이점은 단지 tailrec이라는 예약어가 있고 없고의 차이이다.
 */

fun main()
{
    tailrecPrint(3)
}

tailrec fun tailrecPrint(no: Int = 1, count: Int = 1)
{
    println("loopPrint")
    return if(no == count) return else tailrecPrint(no -1, count)
}