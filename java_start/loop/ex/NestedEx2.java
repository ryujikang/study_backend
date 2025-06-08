package loop.ex;

/* 문제 1
* "피라미드 출력"
*
* int rows를 선언해라.
* 이 수만큼 다음과 같은 피라미드를 출력하면 된다.
* */

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = 0; i <rows; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
