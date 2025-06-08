package scanner.ex;

/* 문제 3
* 음식의 이름(foodName), 가격(foodPrice), 수량(foodQuantity) 입력받기
*  주문한 음식의 총 가격을 계산하고 출력하는 프로그램
* 총 가격(totalPrice) = foodPrice * foodQuantity
*
* 출력 예시
* > 음식 이름을 입력해주세요: 피자
* > 음식의 가격을 입력해주세요: 20000
* > 음식의 수량을 입력해주세요: 2
* > 피자 2개를 주문하셨습니다. 총 가격은 40000원입니다.
* */

import java.util.Scanner;

// tip : Shift + F6 (이름 여러개 한번에 변경)
public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = input.nextLine();

        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice = input.nextInt();

        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = input.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");
    }
}
