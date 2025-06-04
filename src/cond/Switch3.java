package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) { // 2등급, 3등급과 같이 3000원 쿠폰을 준다
            case 1: coupon = 1000; break;
            case 2: // break 가 없으므로, case2 ~ 3이 모두 실행 됨
            case 3: coupon = 3000; break;
            default: coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
