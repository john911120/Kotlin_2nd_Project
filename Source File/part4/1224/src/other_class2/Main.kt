package other_class2

/*
    익스텐션 리시버와 디스패치 리시버의 함수명의 중복
 */
class ExtensionClass {
    fun myFun(){
        println("ExtensionClass myFun()")
    }
}

class DispatchClass {
    fun myFun(){
        println("DispatchClass myFun()")
    }

    fun ExtensionClass.some() {
        myFun()
        this.myFun()
        this@DispatchClass.myFun()
    }
    fun test() {
        val obj: ExtensionClass = ExtensionClass()
        obj.some()
    }
}

fun main() {
    val obj: DispatchClass = DispatchClass()
    obj.test()
}