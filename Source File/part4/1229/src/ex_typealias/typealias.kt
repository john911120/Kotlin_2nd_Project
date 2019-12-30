package ex_typealias

typealias MyInt = Int
typealias MList<T> = MutableList<T>
typealias MC = MyClass
typealias MI = MyInterface

interface MyInterface
class MyClass : MI

fun main() {
    val no : MyInt = 10
    val list : MList<String> = mutableListOf("Hello","simyoung")
    val obj: MC = MC ()
}