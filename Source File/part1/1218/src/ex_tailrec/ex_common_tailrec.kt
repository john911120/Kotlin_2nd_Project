package ex_tailrec

// 코틀린에서 일반적으로 재귀함수 만들기

fun main()
{
    recPrint(3)
}

fun recPrint(no: Int = 1, count: Int = 1)
{
        println("loopPrint")
        return if(no == count) return else recPrint(no -1, count)
}

/*
    반복 출력을 위해 반복문을 안쓰고 재귀함수를 사용하면 단순 문자열 로직을 출력하는 것이 가능하다.
 */