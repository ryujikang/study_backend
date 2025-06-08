package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean res = odd(3);
        System.out.println(res);
    }

    public static boolean odd(int a) {
        return (a % 2 == 0) ? true : false;
    }
}
