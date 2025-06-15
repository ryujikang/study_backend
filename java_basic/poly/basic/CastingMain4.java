package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        // 부 -> 자 (메모리 = 둘 다 생성)
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; // 다운 캐스팅
        child1.childMethod(); // 문제 없음

        // 부 -> 부 (메모리 = 부모만 생성)
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 에러 (ClassCastException)
        child2.childMethod(); // 실행 불가
    }
}
