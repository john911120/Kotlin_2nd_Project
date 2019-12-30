package ex_typealias

class Super {
    inner class Sub

    fun getSubInsance() : MySub {
        return Sub()
    }
}
typealias MySub = Super.Sub