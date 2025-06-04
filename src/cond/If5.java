package cond;

/* 문제
* 온라인 쇼핑몰의 할인 시스템을 개발해야 한다.
* 한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다.
*
* 각각의 할인 조건은 다음과 같다.
* - 아이템 가격이 10,000원 이상일 때, 1,000원 할인
* - 나이가 10살 이하일 때, 1,000원 할인
*
* 이 할인 시스템의 핵심은 '한 사용자가 동시에 여러 할인을 받을 수 있다는 점'이다.
* 예를 들어, 10,000원짜리 아이템을 구매할 때 1,000원 할인을 받고,
* 동시에 나이가 10살 이하이면 추가로 1,000원 더 할인을 받는다.
* 그래서 총 2,000원 까지 할인을 받을 수 있다.
* */

public class If5 {
    public static void main(String[] args) {
        int price = 10000, age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이, 1000원 할인");
        }

        System.out.println("> 총 할인가: " + discount);
        System.out.println("> 최종 가격: " + (price-discount));
    }
}
