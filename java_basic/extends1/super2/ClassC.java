package extends1.super2;

public class ClassC extends ClassB {

    // ClassB(int a)
    // ClassB(int a, int b)

    public ClassC() {
        super(10, 20); // 생성자는 하나만 호출 가능
        System.out.println("Class C 생성자");
    }
}
