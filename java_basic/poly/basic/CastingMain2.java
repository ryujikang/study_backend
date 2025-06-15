package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 -> 자식 (다형적 참조)
        Parent poly = new Child();

        // 자식 기능 호출 불가
//        poly.childMehotd();

        // 일시적 다운 캐스팅 (부모 -> 자식)
        ((Child) poly).parentMethod(); // 해당 메소드를 호출하는 순간만 다운캐스팅
    }
}
