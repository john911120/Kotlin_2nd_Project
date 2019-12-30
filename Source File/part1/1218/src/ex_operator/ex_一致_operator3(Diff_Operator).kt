package ex_operator

// Int값에 따른 상이한 동작
fun main() {
    val boxed1: Int? = 127
    val boxed2: Int? = 127
    val boxed3: Int? = 128
    val boxed4: Int? = 128

    println("boxed1 == boxed2 is ${boxed1 == boxed2}")
    println("boxed3 === boxed4 is ${boxed3 === boxed4}")

}