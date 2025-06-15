package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent(); // 부 -> 부 (메모리상 부모만 생김)
        System.out.println("parent1 호출 -----------");
        call(parent1);

        Parent parent2 = new Child(); // 부 -> 자 (메모리상 자식,부모 둘 다 생김)
        System.out.println("parent2 호출 -----------");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        // 인스턴스의 타입 확인하고 싶으면 ? instanceof
        if (parent instanceof Child child) { // instanceof를 사용과 동시에 변수 선언 가능
            System.out.println("Child 인스턴스 맞음");
            child.childMethod(); // (다운캐스팅 코드 생략)
        }
    }
}
