package ex_exception

fun some(arg:Int):Int {
    if(arg < 1)
        throw Exception("parameter must be greater then zero")
    else{
        var sum = 0
        for(i in 1.. arg){
            sum += i
        }
        return sum
    }
}
fun main() {
    try{
        println("${some(5)}")

        println("${some(-1)}")

        println("main bottom...")
    } catch (e: Exception) {
        println("Exception... ${e.toString()}")
    }
}