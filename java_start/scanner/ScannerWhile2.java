package scanner;

import java.util.Scanner;

// 숫자 두개를 더해서 출력하는 프로그램
// 두 수 모두 0이면 프로그램 종료

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자 입력: ");
            int n1 = sc.nextInt();
            System.out.print("두 번째 숫자 입력: ");
            int n2 = sc.nextInt();

            if (n1 == 0 && n2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.println("입력된 두 수 " + n1 + " + " + n2 + " = " + (n1+n2));
        }
    }
}
