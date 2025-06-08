package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 20; // a값 변경
        System.out.println("변경 a -> 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 30; // b값 변경
        System.out.println("변경 b -> 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
