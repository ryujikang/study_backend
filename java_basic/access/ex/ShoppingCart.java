package access.ex;
/*
문제 - 쇼핑 카트
ShoppingCartMain 코드가 작동하도록 Item , ShoppingCart 클래스를 완성해라.

요구사항
- 접근 제어자를 사용해서 데이터를 캡슐화 하세요.
- 해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
- 장바구니에는 상품을 최대 10개만 담을 수 있다.
    - 10개 초과 등록시: "장바구니가 가득 찼습니다." 출력
*/
public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCnt = 0;

    // TODO 나머지 코드 완성해라.
    public void addItem(Item item) {
        if (itemCnt < items.length) {
            items[itemCnt] = item;
            itemCnt++;
        } else {
            System.out.println("장바구니 가득 참");
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i=0; i<itemCnt; i++) {
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotal());

        }
        System.out.println("전체 가격 합: " + calcTotal());
    }

    private int calcTotal() {
        int total = 0;
        for (int i=0; i<itemCnt; i++) {
            Item item = items[i];
            total += item.getTotal();
        }
        return total;
    }

}
