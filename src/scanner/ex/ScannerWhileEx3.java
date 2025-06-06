package scanner.ex;

/* 문제 9
* 여러개의 숫자 입력
* 숫자들의 합계와 평균 계산
* 마지막에는 -1을 입력하여 숫자입력 종료
* 합계(sum), 평균(average) 출력
* 평균은 소수점 아래까지 계산
* */

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cnt = 0, sum = 0;
        double average;

        System.out.println("숫자 입력: ");
        while (true) { // while 조건문에서 (input = scanner.nextInt()) != -1 로 하여도 됨
            int num = input.nextInt();

            if (num == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            sum += num;
            cnt++;
        }

        System.out.println("입력한 숫자들의 합계: " + sum);
        average = (double) sum/cnt;
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
