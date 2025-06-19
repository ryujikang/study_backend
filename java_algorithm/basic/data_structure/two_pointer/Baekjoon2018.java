import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] S = new int[n+1];
        for (int i=1; i<=n; i++) {
            S[i] = S[i-1] + i;
        }

        int cnt = 1; // 카운트 = 1로 초기화 (n 자기 자신은 항상 같음)
        int left, right; // 두 포인터 left, right
        left= right = 0; // index 0부터 시작

        for (int i=1; i<=n; i++) {
            int res = S[right] - S[left];   // res = 연속된 수의 합 (구간 합)

            if (res > n) { // 구간 합이 n보다 클 경우
                left++;
                continue;
            }

            if (res == n) { // 구간 합이 n일 경우
                cnt++; // 카운트 증가
                left++; // left 증가 (더 이상 right를 증가해도 연속된 값으로 불가)
//                System.out.println("left: " + left + ", right: " + right + " = " + res);
                continue;
            }

            right++; // 위 조건이 맞지 않으면, right 증가
        }
        System.out.println(cnt);

    }
}
