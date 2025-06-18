import java.util.Scanner;

// 평균 구하기
public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // 시험 본 과목 개수
        
        int[] subjects = new int[n]; // 현재 성적
        int max = 0;
        for (int i=0; i<n; i++) {
            subjects[i] = input.nextInt();
            if (subjects[i] > max) max = subjects[i];
        }

        // 점수 수정 후 합계 구하기
        double sum = 0;
        for (int i=0; i<n; i++) {
            sum += (double)subjects[i] / max * 100; // 과목점수 수정: 점수/(최댓값*100)
        }

        // 평균 출력
        System.out.println(sum/n);
    }
}
