package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a); // a의 값을 복사해서 넘김
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
