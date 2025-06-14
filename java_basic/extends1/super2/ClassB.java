package extends1.super2;

public class ClassB extends ClassA {

    // 생성자의 첫줄에 super(...) 를 사용해서 부모 클래스의 생성자를 호출
    // 생략하면 자바는 부모의 기본 생성자를 호출하는 super() 를 자동으로 만들어 줌

    public ClassB(int a) {
//        super(); // 기본 생성자 생략 가능
        this(a, 0);
        System.out.println("Class B 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("Class B 생성자 a = " + a + ", b = " + b);
    }
}
