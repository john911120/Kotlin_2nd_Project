@file: JvmName("MyTest")
package ex_annotation

annotation class ex_using_target_apply

annotation class ex_using_target_apply3

class ex_using_target_apply2 constructor(@param: TestAnnotation var email:String) {
    @get:[TestAnnotation TestAnnotation2]
    var no: Int=10

    @property : TestAnnotation
    var name: String = "shim"

    @field: TestAnnotation
    var age : Int = 20

    @setparam: TestAnnotation
    var phone: String ="01012345"
}
fun @receiver: TestAnnotation Test.myFun() { }