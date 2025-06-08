package scanner.ex;

/* 문제 6
* 두 정수 num1, num2를 입력받음
* num1이 num2보다 크면 두 숫자를 교환 및 출력
* num1부터 num2까지의 각 숫자를 출력 (','로 구분)
* */

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int num1 = input.nextInt();
        System.out.print("두 번째 숫자: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

        System.out.print(num1);
        for (int i=num1+1; i<=num2; i++) {
            System.out.print("," + i);
        }
    }
}
