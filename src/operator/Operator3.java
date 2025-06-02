package operator;

public class Operator3 {
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3; // 1 + (2 * 3) 과 같음
        int sum2 = (1 + 2) * 3; // 괄호()의 우선순위가 높음
        System.out.println("sum1 = " + sum1); // sum1 = 7
        System.out.println("sum2 = " + sum2); // sum2 = 9
    }
}
