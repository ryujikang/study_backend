package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {

        // 전위 증감 연산자 사용
        int a = 1, b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 2
        // a = a + 1;
        // b = a;


        // 후위 증감 연산자 사용
        int c = 1, d = 0;

        d = c++; // c의 현재 값을 d에 먼저 대입하고, 그 후 c의 값을 증가시킴
        System.out.println("c = " + c + ", d = " + d); // c = 2, d = 1
        // d = c;
        // c = c + 1;
    }
}
