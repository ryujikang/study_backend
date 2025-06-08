package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000, age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매, 1000원 할인");
        } else if (age <= 10) { // 실행되지 않음!!!
            discount += 1000;
            System.out.println("어린이, 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("> 총 할인가: " + discount);
        System.out.println("> 최종 가격: " + (price-discount));
    }
}
