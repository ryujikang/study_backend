package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        // 조건이 거짓이어도, 최초 한번은 실행됨
        do {
            System.out.println("현재 숫자는: " + i++);
        } while (i < 3);
    }
}
