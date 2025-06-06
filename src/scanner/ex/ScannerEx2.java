package scanner.ex;

/* 문제 2
* 하나의 정수 입력받고, 홀수인지 짝수인지 판별
* 
* 출력예시
* > 하나의 정수를 입력하세요: 1
* > 입력한 숫자 1은/는 홀수입니다.
* */

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요: ");
        int n = input.nextInt();
        
        if (n % 2 == 0) System.out.println("입력한 숫자 " + n + "은/는 짝수입니다.");
        else System.out.println("입력한 숫자 " + n + "은/는 홀수입니다.");
    }
}
