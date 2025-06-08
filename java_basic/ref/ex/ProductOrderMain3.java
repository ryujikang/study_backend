package ref.ex;

/*
문제: 상품 주문 시스템 개발 - 사용자 입력

문제 설명
앞서 만든 상품 주문 시스템을 사용자 입력을 받도록 개선해보자.

요구 사항
- 아래 입력, 출력 예시를 참고해서 다음 사항을 적용하자.
- 주문 수량을 입력 받자
    예) 입력할 주문의 개수를 입력하세요:
- 가격, 수량, 상품명을 입력 받자
    입력시 상품 순서를 알 수 있게 "n번째 주문 정보를 입력하세요." 라는 메시지를 출력하세요.
- 입력이 끝나면 등록한 상품과 총 결제 금액을 출력하자.

입/출력 예시
입력할 주문의 개수를 입력하세요: 3
1번째 주문 정보를 입력하세요.
상품명: 두부
가격: 2000
수량: 2
2번째 주문 정보를 입력하세요.
상품명: 김치
가격: 5000
수량: 1
3번째 주문 정보를 입력하세요.
상품명: 콜라
가격: 1500
수량: 2
상품명: 두부, 가격: 2000, 수량: 2
상품명: 김치, 가격: 5000, 수량: 1
상품명: 콜라, 가격: 1500, 수량: 2
총 결제 금액: 12000
*/

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = input.nextInt();
        input.nextLine();

        ProductOrder[] products = settingOrder(input, n);

        printOrders(products);

        int totalPrice = getTotalAmount(products);
        System.out.println("총 결제 금액: " + totalPrice);
    }

    static ProductOrder[] settingOrder(Scanner input, int n) {
        ProductOrder[] products = new ProductOrder[n];

        for (int i=0; i<n; i++) {
            products[i] = new ProductOrder();

            System.out.println(i+1 +"번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            products[i].productName = input.nextLine();

            System.out.print("가격: ");
            products[i].price = input.nextInt();

            System.out.print("수량: ");
            products[i].quantity = input.nextInt();
            input.nextLine();
        }

        return products;
    }

    static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = name;
        product.price = price;
        product.quantity = quantity;

        return product;
    }

    static void printOrders(ProductOrder[] products) {
        for (int i=0; i<products.length; i++) {
            System.out.println("상품명: " + products[i].productName + ", 가격: " + products[i].price + ", 수량: " + products[i].quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] products) {
        int totalPrice = 0;
        for (int i=0; i<products.length; i++) {
            totalPrice += products[i].price * products[i].quantity;
        }
        return totalPrice;
    }
}
