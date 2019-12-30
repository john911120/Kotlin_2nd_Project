package ex_annotation

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
annotation class ex_annotation_option

@ex_annotation_option
class Test6 {
   // @ex_annotation_option constructor(no: Int) { }
   // @ex_annotation_option
    val myVal: Int = 10

    @ex_annotation_option
    fun myFun(@ex_annotation_option no: Int){
        val result = @ex_annotation_option
        if(no>10){
            10
        } else {
            0
        }
    }
}