package scanner.ex;

/* 문제 7
* 이름과 나이를 반복해서 입력
* 입력받은 이름과 나이를 출력
* "종료"를 입력하면 프로그램이 종료
* */

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("이름을 입력하세요: ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // 10\n -> 정수 10만 담음
            input.nextLine(); // \n을 버림

            System.out.println("> 이름: " + name + ", 나이: " + age);
        }
    }
}
