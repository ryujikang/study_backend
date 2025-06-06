package scanner;

import java.util.Scanner;

// "exit" 이라는 문자열을 입력받으면 종료되는 프로그램
public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요: ");
            String keyword = sc.nextLine();

            if (keyword.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("입력한 문자열: " + keyword);
        }
    }
}
