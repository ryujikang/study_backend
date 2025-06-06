package scanner.ex;

/* 문제 1
* 입력받은 이름과 나이 출력
*
* 출력 형태
* > 당신의 이름을 입력하세요: 자바
* > 당신의 나이를 입력하세요: 30
* > 당신의 이름은 자바이고, 나이는 30살입니다.
* */

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("당신의 나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }
}
