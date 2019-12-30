package ex_exception

fun main() {
    try{
        println("try...top")

        val data: String = "200"

        val intData: Int? = data.toInt()

        println("try...Bottom")
        } catch(e: Exception) {
            println("catch...")
    } finally {
        println("finally...")
    }
}