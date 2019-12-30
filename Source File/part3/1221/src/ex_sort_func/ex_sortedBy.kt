package ex_sort_func

fun main() {
    listOf(7,6,1).sortedBy { it % 3 }
        .forEach { println(it) }
}