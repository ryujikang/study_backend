import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // 소수를 판별할 범위 설정
        boolean[] isPrime = new boolean[1000001];
        for (int i = 2; i < isPrime.length; i++) isPrime[i] = true;

        // '에라토스테네스의 체'를 이용한 소수찾기
        for (int i = 2; i < isPrime.length; i++) {
            // 해당 i가 소수가 아니면 건너뛰기
            if (!isPrime[i]) continue;
            // i가 소수이면 i의 배수는 모두 소수가 아님을 표기
            for (int j = i * 2; j < isPrime.length; j += i) {
                isPrime[j] = false;
            }
        }

        for (int i=m; i<=n; i++) {
            if (isPrime[i])
                System.out.println(i);
        }
    }
}
