package access.a;

/*
접근 제어자의 종류
    - private : 모든 외부 호출을 막는다.
    - default (package-private): 같은 패키지안에서 호출은 허용한다.
    - protected : 같은 패키지안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
    - public : 모든 외부 호출을 허용한다.

순서대로 private 이 가장 많이 차단하고, public 이 가장 많이 허용한다.
private -> default -> protected -> public
*/

public class AccessData {
    public int publicField; // public
    int defaultField; // default
    private int privateField; // private

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    // 자기 자신에게 접근 가능
    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
