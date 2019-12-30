package ex_exception


fun some2() {
    val name: String? = null
    val s : String = name ?: throw IllegalArgumentException("Name required")
    println("some1 bottom")
}
fun some3(arg: Int): Nothing {
    if(arg > 0)
        throw Exception ("some3 exception.. arg>0 true")
    else
        throw Exception ("some3 exception.. arg>0 false")
}
fun main() {
    try{
        some2()
    } catch (e: Exception) {
        println(e.toString())
    }

    try{
        some3(10)
    } catch(e: Exception) {
        println(e.toString())
    }
}