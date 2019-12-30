package ex_delegate

interface Print{
    fun print(arg:String)
}

    class MyDelegatee: Print {
        override fun print(arg: String) {
            println("i am delegatee : $arg")
        }
    }

    class MyDelegator1(obj : MyDelegatee): Print by obj

    fun main(){
        val obj: MyDelegatee = MyDelegatee()
        MyDelegator1(obj).print("hello simyoung")
    }
