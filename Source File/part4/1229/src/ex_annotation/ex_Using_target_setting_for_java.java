package ex_annotation;

public class ex_Using_target_setting_for_java {
    private int no = 10;

    @TestAnnotation
    public final int getNo(){
        return this.no;
    }

    public final void setNo(int var1) {
        this.no = var1;
    }
}
