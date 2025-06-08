package scanner.ex;

/* 문제 8
* 상품의 가격(price), 수량(quantity) 입력 후, 곱 출력
* 총 비용 출력
* -1 입력하여 가격입력 종료
* */

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요(-1 종료): ");
            int price = input.nextInt();

            if (price == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("구매하려는 수량: ");
            int quantity = input.nextInt();

            System.out.println("총 비용 : " + (price*quantity));
        }
    }
}
