package ex_typealias

typealias MyType = (Int) -> Boolean
val myFun: MyType = {it > 10}