package poly.basic;

// 다형적 참조 : 부모는 자식을 품을 수 있다.

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수 -> 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent(); // 메모리상 Parent만 생성됨
        parent.parentMethod();

        // 자식 변수 -> 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child(); // 메모리상 Child, Parent 모두 생성됨
        child.parentMethod();
        child.childMethod();

        // 다형적 참조
        // 부모 변수 -> 자식 인스턴스 참조
        System.out.println("Parent -> CHild");
        Parent poly = new Child(); // 메모리상 Child, Parent 모두 생성됨
        poly.parentMethod();
//        poly.childMethod(); // 자식 기능은 호출 불가 (컴파일 오류)

        // 자식은 부모를 담을 수 없음
//        Child child1 = new Parent();
    }
}
