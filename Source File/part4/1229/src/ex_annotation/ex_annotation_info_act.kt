package ex_annotation

annotation class ex_annotation_info_act

class Test1{
    @TestAnnotation
    fun myFun1() { }

    fun myFun2() { }
}

fun main() {
    val methods = Test::class.java!!.methods

    for(method in methods) {
        val methodName = method.name
        if(method.isAnnotationPresent(TestAnnotation::class.java)){
            println("$methodName function has TestAnnotation annotation...")
        }
    }
}