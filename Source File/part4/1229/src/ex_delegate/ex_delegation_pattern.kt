package ex_delegate

class ex_delegation_pattern {
    fun print(str: String) {
        println("i am delegatee : $str")
    }
}
    class MyDelegator{
        val delegatee: ex_delegation_pattern = ex_delegation_pattern()

        fun print(str : String) {
            delegatee.print(str)
        }
    }

fun main() {
    val obj: MyDelegator = MyDelegator()
    obj.print("hello simyoung?")
}