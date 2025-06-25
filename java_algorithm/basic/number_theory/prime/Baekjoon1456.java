import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());

        // 소수를 판별할 범위 설정
        boolean[] isPrime = new boolean[(int) Math.sqrt(end) + 1];
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

        // 주어진 범위 [A,B]에 해당하는 '거의 소수'의 개수 찾기
        int answer = 0;
        // 찾아낸 소수에 대해서 N제곱이 범위에 해당하는지 찾기 시작
        for (int i = 2; i < isPrime.length; i++) {
            // i가 소수인 경우에만
            if (isPrime[i]) {
                long temp = i;
                // 자료형의 범위를 넘어가지 않게 양변을 i로 나눈값으로 범위에 속하는지 판단
                while (temp <= (double) end / i) {
                    if (temp >= (double) start / i) {
                        answer++;
                    }
                    temp *= i;
                }
            }
        }
        System.out.println(answer);
    }
}

