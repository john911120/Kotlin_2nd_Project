package ex_annotation

/*
    어노테이션에는 다른 어노테이션이나 클래스 타입을 선언 할 수 있다. 어노테이션을 다른 어노테이션의
    주 생성자 프로퍼티로 @ 기호를 추가하지 않는다. 그리고 다른 클래스를 어노테이션의 주 생성자 프로퍼티로
    지정할 때 타입을 18번째 줄처럼 해야 컴파일러가 자동으로 전달받는 타입으로 변경 된다.
 */

/*
    18번째 줄에서 어노테이션을 선언하면서 주 생성자를 명시 했는데 에러가 나왔다. 주 생성자의 프로퍼티 타입이 User클래스인 객체타입이어서
    허용하지 않는다.
 */

import kotlin.reflect.KClass

annotation class ex_annotation_data_type(val count : Int)

annotation class ex_annotation_data_type2(val otherAnn: ex_annotation_data_type, val arg1: KClass<*>)

class User

// annotation class ex_annotation_data_type3(val User : User)

@ex_annotation_data_type(10)

@ex_annotation_data_type2(ex_annotation_data_type(20), String::class)
class Test4 { }

const val myData : Int = 10
@ex_annotation_data_type(myData)
class Test5 { }