package loop.ex;

/* 문제 1
* "자연수 출력"
*
* 처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요.
* 이때, count라는 변수를 사용해야 합니다.
* while문, for문 2가지 버전의 정답을 만들어야 합니다.
* */

public class ForEx1 {
    public static void main(String[] args) {
        for (int count=1; count<=10; count++)
            System.out.println(count);
    }
}
