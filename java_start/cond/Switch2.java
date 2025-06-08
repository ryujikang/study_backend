package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        // switch 문으로 변경 (단순하게 값이 같은지만 비교)
        switch (grade) { // 더 간단해짐
            case 1: coupon = 1000; break;
            case 2: coupon = 2000; break;
            case 3: coupon = 3000; break;
            default: coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
