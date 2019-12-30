package ex_annotation_java

annotation class KotlinAnnotation(val no : Int, val name: String)

@KotlinAnnotation(10,"Shim")
/* 에러
@JavaAnnotation(10,"kim")
@JavaAnnotation(intValue = 10, stringValue = "dododo")
*/
class ex_kotlin_for_java_annotation{ }