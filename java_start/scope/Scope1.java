package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // main 블럭 안에서만 생존

        if (true) {
            int x = 20; // if 블럭 안에서만 생존
            System.out.println("if m = " + m); // main에서 선언한 m 사용가능
            System.out.println("if x = " + x);
        } // x 생존 끝

        // x 접근 불가
        // java: cannot find symbol
        //  symbol:   variable x
        //  location: class scope.Scope1
//        System.out.println("main x = " + x);
        System.out.println("main m = " + m);
    } // m 생존 끝
}
