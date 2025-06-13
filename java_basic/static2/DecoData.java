package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue; // static 사용, 클래스 멤버 변수

    // static 메서드는 static 만 사용 가능 -> 인스턴스처럼 참조값의 개념이 없음, 모든 곳에서 static 호출 가능(접근제어자 허용 시)
    public static void staticCall() {
        // 인스턴스 변수&메소드 접근, compile error
//        instanceValue++;
//        instanceMethod();
        
        // 정적(클래스) 변수&메소드 접근
        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        // 인스턴스 변수&메소드 접근
        instanceValue++;
        instanceMethod();

        // 정적(클래스) 변수/메소드 접근
        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
