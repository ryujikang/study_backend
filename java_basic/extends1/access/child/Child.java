package extends1.access.child;

import extends1.access.parent.Parent; // 다른 패키지에 있음

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계(= 다른 패키지 ok) or 같은 패키지
//        defaultValue = 1; // 컴파일 오류, 다른 패키지 접근 불가
//        privateValue = 1; // 컴파일 오류, 접근 불가

        publicMethod();
        protectedMethod(); // 상속 관계(= 다른 패키지 ok) or 같은 패키지
//        defaultMethod(); // 컴파일 오류, 다른 패키지 접근 불가
//        privateMethod(); // 컴파일 오류, 접근 불가

        printParent();
    }
}
