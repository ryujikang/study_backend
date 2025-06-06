package scanner.ex;

/* 문제 10
* 여러 상품정보(상품명, 가격, 수량) 입력 -> 총 가격 출력
* 세가지 정수 option 옵션 1(상품입력), 2(결제), 3(프로그램 종료)
* 1 -> 상품명, 가격, 수량 입력
* 2 -> 총 비용 출력 후 0으로 초기화
* 3 -> 프로그램 종료
* 이외의 값 입력 -> 올바른 옵션 선택 메시지
* */

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.println(">>> 1(상품입력), 2(결제), 3(프로그램 종료) <<<");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.print("상품 입력: ");
                String item = sc.nextLine();

                System.out.print("상품 가격: ");
                int price = sc.nextInt();

                System.out.print("구매 수량: ");
                int n = sc.nextInt();

                total += n * price;
                System.out.println("상품명: " + item + ", 가격: " + price + ", 수량: " + n + ", 합계: " + (n*price));
            } else if (option == 2) {
                System.out.println("총 비용: " + total);
                total = 0;
            } else if (option == 3) {
                System.out.println("프로그램 종료");
                break;
            } else System.out.println("올바른 옵션 선택");
        }

    }
}
