package ex_operator

import java.util.Arrays.asList

/*
    *은 곱하기 연산자이지만 코틀린에서는 전개 연산자로 사용이 된다.
    * 전개 연산자는 배열값을 나열할 때 사용하는 기능이다.
    * List에 사용이 가능하다. 데이터 전개는 바로 사용이 안되지만 배열 데이터로 변경해서 이용해야한다.
 */
fun some1(vararg a: String) {
    val iterator = a.iterator()
    while(iterator.hasNext()){
        println(iterator.next())
    }
}

fun main(args: Array<String>)
{
    val array1= arrayOf(10, 20, 30)

    val list1 = asList(1, 2, array1[0], array1[1], array1[2], 100, 200)
    list1.forEach({println(it)})

    val list2 = asList(1, 2, *array1, 100, 200)
    list2.forEach({println(it)})

    val array3 = arrayOf<String>("hello","world")
    some(*array3)

    val list3 = listOf<String>("a","b")
    some(*list3.toTypedArray())
}