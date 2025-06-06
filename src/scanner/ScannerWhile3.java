package scanner;

import java.util.Scanner;

// 입력 받아 합산하는 프로그램
// 한번에 한 개의 정수 입력받기, 0을 입력하면 종료
// 종료될 때까지 입력된 모든 정수의 합 출력
public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, i = 1;

        while (true) {
            System.out.print(i + "번째 숫자 입력: ");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("입력한 모든 정수의 합: " + sum);
                break;
            }

            sum += num;
            i++;
        }

    }
}
