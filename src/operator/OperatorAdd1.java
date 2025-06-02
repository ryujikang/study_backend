package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        // 기존의 증감 방식
        a = a + 1; // a값을 1 증가시려면?
        System.out.println("a = " + a); // 1

        a = a + 1;
        System.out.println("a = " + a); // 2

        // 증감연산자 사용 (간단)
        ++a; // a = a + 1
        System.out.println("a = " + a); // 3

        ++a;
        System.out.println("a = " + a); // 4

        --a; // a = a - 1
        System.out.println("a = " + a); // 3
    }
}
