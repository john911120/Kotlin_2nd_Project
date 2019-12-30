package ex_tailrec

// 로직이 반복되는 일반적인 함수를 만든다.


fun main()
{
    loopPrint(3)
}

fun loopPrint(no: Int = 1)
{
    var count = 1
    while(true) {
        println("loopPrint")
        if(no == count) return
        else count++
    }
}

/*
    무언가의 로직을 계속적으로 반복을 해야하는 경우에는 재귀함수라는 것을 사용하면 된다.
 */