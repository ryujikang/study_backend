package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        // 조건문은 false => 한번도 실행되지 않음
        while (i < 3) {
            System.out.println("현재 숫자는: " + i++);
        }
    }
}
