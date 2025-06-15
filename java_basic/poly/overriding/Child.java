package poly.overriding;

public class Child extends Parent{

    public String value = "child";

    // 메소드 오버라이딩 (재정의)
    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
