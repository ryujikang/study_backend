package scanner.ex;

/* 문제 5
* a=10, b=20이 들어있음
* a와 b의 값을 서로 바꾸어라
* temp변수 활용
* */

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp;

        System.out.println("변경 전: a = " + a + " b = " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("변경 후: a = " + a + " b = " + b);
    }
}
