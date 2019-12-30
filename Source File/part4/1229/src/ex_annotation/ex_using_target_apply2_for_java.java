package ex_annotation;

import com.sun.istack.internal.NotNull;

public class ex_using_target_apply2_for_java {
    private int no;
    private String name;

    @TestAnnotation
    private int age;

    private String phone;
    private String email;

    @TestAnnotation
    @TestAnnotation2
    public final int getNo() {
        return this.no;
    }

    public final void setNo(int var1){
        this.no = var1;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String var1) {
        this.name = var1;
    }

    public final int getAge() {
        return this.age;
    }

    public void setAge(int var1) {
        this.age = var1;
    }

    public String getPhone() {
        return this.phone;
    }

    public final void setPhone(@TestAnnotation @NotNull String var1) {
        this.phone = var1;
    }

    public String getEmail() {
        return this.email;
    }

    public final void setEmail(@NotNull String var1) {
        this.email = var1;
    }

    public ex_using_target_apply2_for_java(@TestAnnotation @NotNull String email) {
        super();
        this.email = email;
        this.age = 40;
        this.name = "shim";
        this.no = 10;
        this.phone = "01012345";
    }
}
