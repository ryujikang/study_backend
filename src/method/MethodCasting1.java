package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double n = 1.5;
//        printNumber(n); // 컴파일 오류 (타입 다름)
        printNumber((int) n); // 1.5 -> 1로 넘김
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
