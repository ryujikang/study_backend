package overloading;

public class Overloading2 {
    public static void main(String[] args) {
        // 매개변수의 개수는 같지만, 타입이 다른 함수
        myMethod(1, 1.2);
        myMethod(1.2, 2);
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
