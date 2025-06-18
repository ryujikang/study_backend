import java.util.Scanner;

// 숫자의 합 구하기
public class Baekjoon11720 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String str = input.next(); //공백 전까지 입력받음 (nextLine()은 Enter 입력 시까지)
        char[] nums = str.toCharArray(); // "문자열"을 -> '문자 배열'로 반환

        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i] - '0'; // 정수로 변환하여 더해줌
        }

        System.out.println(sum);
    }
}
