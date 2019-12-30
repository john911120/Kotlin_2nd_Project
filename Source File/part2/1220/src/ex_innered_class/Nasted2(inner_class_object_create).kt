package ex_innered_class

class Outer{
    private var no : Int = 10;
    fun outerfun(){
        println("outerFun()..")
    }
    inner class Nested(){
        val name: String = "John"
        fun myfun(){
            println("Nested... myFun")
            no = 741
            outerfun()
        }
    }

    fun createNested(): Nested {
        return Nested()
    }
}

fun main() {
    val obj1: Outer.Nested = Outer().Nested()
    val obj2: Outer.Nested = Outer().createNested()
}