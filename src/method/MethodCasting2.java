package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int n = 100;
        printNumber(n); // 자동 형변환이 됨, int -> double
    }

    // 매개변수 타입이 double임
    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
