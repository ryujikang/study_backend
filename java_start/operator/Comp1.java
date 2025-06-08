package operator;

public class Comp1 {
    public static void main(String[] args) {
        // 비교 연산자 (boolean값 반환)

        int a = 2, b = 3;
        System.out.println(a == b); // 같다
        System.out.println(a != b); // 다르다
        System.out.println(a > b); // 크다
        System.out.println(a < b); // 작다
        System.out.println(a >= b); // 크거나 같다
        System.out.println(a <= b); // 작거나 같다

        // 결과를 boolean 변수에 담을 수 있음
        boolean res = a == b; // false
        System.out.println("res = " + res);
    }
}
