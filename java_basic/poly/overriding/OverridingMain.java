package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        // 자식 -> 자식
        Child child = new Child();
        System.out.println("1. Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        // 부모 -> 부모
        Parent parent = new Parent();
        System.out.println("2. Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 부모 -> 자식 (다형적 참조)
        Parent poly = new Child();
        System.out.println("3. Parent -> Child");
        System.out.println("value = " + poly.value); // Parent 타입에 있는 value 값을 읽음
        poly.method(); // 재정의한 메소드 호출 (오버라이딩 된 메소드가 항상 우선권을 가짐)
    }
}
