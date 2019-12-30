package ex_nested_class;

public class Java_Nested {

    void myFun(){
        final int no = 0;
        class NestedClass {
            void nestFun() {
                System.out.println(no);
            }
        }
    }
}
