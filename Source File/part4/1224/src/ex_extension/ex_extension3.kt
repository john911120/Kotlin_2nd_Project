package ex_extension

open class ex_extension3 {
    open fun superFun() {
        println("Super... superFun...")
    }
}

class Sub1: ex_extension3() {
    var data: Int = 20
    override fun superFun() {
        println("sub.. superFun...${data}")
    }
    fun some1(data:Int) {
        this.data = data
        superFun()
        super.superFun()
    }
}
/*
    확장함수는 클래스 외부에 정적으로 등록된다. 그래서 확장한 클래스 타입만 인지 할 수 있으며
    동적으로 상위 판단 클래스를  판단 할 수 없다. 즉, 클래스 확장시에는 확장 클래스만 인식한다는 것을 의미한다.
    이를 이해기 위해 java로 변형 시켜보면 알수 있다.(jadx을 활용하면 된다.)
// 실행시에 판단이 되는 코드
fun Sub.some2(data:Int) {
    this.data = data
    superFun()
    super.superFun()
}

fun main() {
    val obj: Sub = Sub()
    obj.some1(10)
    obj.some2(100)
}
*/