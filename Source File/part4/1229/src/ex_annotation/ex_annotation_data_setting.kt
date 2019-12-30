package ex_annotation

annotation class ex_annotation_data_setting(val count : Int)

class Test3{
    @ex_annotation_data_setting( count = 3 )
    fun some(){
        println("some...")
    }
}

fun main() {
    val obj: Test3 = Test3()
    
    val methods = Test3::class.java!!.methods
    
    for(method in methods) {
        if(method.isAnnotationPresent(ex_annotation_data_setting::class.java)){
            val annotation=method.getAnnotation(ex_annotation_data_setting::class.java)
            val count = annotation.count
            for(i in 1..count){
                obj.some()
            }
        }
    }
}