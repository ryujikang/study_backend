package ref.ex;

/*
문제: 상품 주문 시스템 개발 - 리팩토링

문제 설명
앞서 만들었던 다음 클래스에 있는 "상품 주문 시스템"을 리팩토링 하자.
class1.ex.ProductOrderMain

당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
먼저, 상품 주문 정보를 담을 수 있는 ProductOrder 클래스를 만들어보자.

요구 사항
ProductOrder 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
    상품명 ( productName )
    가격 ( price )
    주문 수량 ( quantity )

출력 예시
상품명: 두부, 가격: 2000, 수량: 2
상품명: 김치, 가격: 5000, 수량: 1
상품명: 콜라, 가격: 1500, 수량: 2
총 결제 금액: 12000
*/
public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] products = new ProductOrder[3];

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        products[0] = createOrder("두부", 2000, 2);
        products[1] = createOrder("김치", 5000, 1);
        products[2] = createOrder("콜라", 1500, 2);

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(products);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalPrice = getTotalAmount(products);
        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalPrice);
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
