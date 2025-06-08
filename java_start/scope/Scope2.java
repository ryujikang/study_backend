package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;

        for (int i=0; i<2; i++) { // for문 블럭 내부
            System.out.println("for m = " + m); // 외부에서 -> 내부 접근가능
            System.out.println("for i = " + i);
        } // i 생존 종료

        System.out.println("main m = " + m);
        // 내부에서 -> 외부 접근불가
//        System.out.println("main i = " + i);
    }
}
