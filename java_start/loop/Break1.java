package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0, i = 1;

        // 조건문이 항상 참
        while (true) {
            sum += i;

            // sum이 10보다 크면 실행됨
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; // 반복문 종료
            }
            i++;
        }
    }
}
