package array.ex;

/* 문제 9
* 상품 관리 프로그램
* 기능1 - 상품등록: 상품 이름, 가격을 입력받아 저장
* 기능2 - 상품목록: 지금까지 등록한 모든 상품의 목록 출력
* 
* 동작 순서
* 0. 세 가지 선택 제시: "1. 상품 등록, 2. 상품 목록, 3. 종료"
* 1. 상품 등록 선택 -> 상품 이름, 가격 입력받아 저장
* 2. 상품 목록 선택 -> 배열에 저장된 모든 상품 출력
* 3. 종료 선택 -> 프로그램 종료
*
* 제약조건
* - 상품은 최대 10개까지 등록 가능
* - 사용해야하는 변수 및 구조
*   Scanner sc
*   String[] productNames
*   int[] productPrices
*   int productCount
* */

import java.util.Scanner;

public class ProductAdminEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴 선택: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    if (productCount >= 10) {
                        System.out.println("더 이상 상품 등록 불가");
                        continue;
                    }
                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = sc.nextLine();
                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[productCount] = sc.nextInt();
                    productCount++;
                    continue;
                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품 없음");
                        continue;
                    }
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                    continue;
                case 3:
                    System.out.println("프로그램 종료");
                    System.exit(0);
                default:
                    System.out.println("메뉴 선택 오류");
            }
        }

    }
}
