package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5, b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈 ( 0으로 나눌 수 없다!!! )
        int div = a / b; // -> 2.5 (int형 변수이므로, .5는 날라감)
        System.out.println("a / b = " + div); // 출력 5 / 2 = 2
//        System.out.println(10/0);
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at operator.Operator1.main(Operator1.java:22)

        // 나머지
        int mod = a % b; // 몫 = 2, 나머지 = 1
        System.out.println("a % b = " + mod); // 출력 5 % 2 = 1
    }
}
