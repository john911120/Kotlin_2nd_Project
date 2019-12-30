package ex_operator

import java.util.Arrays.asList

/*
    *은 곱하기 연산자이지만 코틀린에서는 전개 연산자로 사용이 된다.
    * 전개 연산자는 배열값을 나열할 때 사용하는 기능이다.
    * 만약에 배열의 값이 100개라고 가정한다면 100개의 인덱스 값을 일일이 가르키기에는 한계가 있어서,
    * 답답하게 느겨질 것이다. 이럴 때 사용하는 것이 바로 전개 연산자의 힘이다.
 */
fun main()
{
    val array1 = arrayOf(10,20,30,40,50,60,70,80,90)

    val list2 = asList(1,2, *array1, 100, 200)
    list2.forEach({println(it)})
}