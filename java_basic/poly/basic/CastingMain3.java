package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업 캐스팅
        Parent parent2 = child; // 업 캐스팅 생략 가능(권장)

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
