package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 -> 자식 (다형적 참조)
        Parent poly = new Child();

        // 자식 기능 호출 불가
//        poly.childMehotd();

        // 다운 캐스팅 (부모 -> 자식)
        Child child = (Child) poly;
        child.childMethod(); // 자식 기능 호출 가능
    }
}
