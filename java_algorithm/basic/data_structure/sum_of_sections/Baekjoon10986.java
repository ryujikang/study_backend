import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        /* index        0   1   2   3   4   5
        *  A[i]             1   2   3   1   2   // 입력한 n개의 수 An
        *  S[i]             1   3   6   7   9
        * S[i] % m          1   0   0   1   0   // 1. (i, j) => (1,2), (1,3), (1,5) => 구간 합 % m 이 0인 경우 총 3가지
        *                   x           x
        *
        * index         0   1   2   // 나머지(% m) 결과로 나올 수 있는 경우 = 0, 1, 2
        * cnt[i]        3   2   0   // 나머지가 같은 경우의 개수 => 나머지 0: 3가지, 나머지1: 2가지, 나머지2: 0가지
        *
        *
        * =>> 2. 나머지가 같은 것 중에서, 해당되는 인덱스 두 개를 고름 (ex. 나머지가 1인 경우 => 'x' 표시한 곳)
        *  >> (i+1, j) = (2, 4)     // 2부터 4 사이의 구간의 합
        *  >> S[j] - S[i] = S[4] - S[1] = 7 - 1 = 6     // 그 사이의 구간의 합도 m으로 나누어 떨어짐 (6 % m = 0)
        *  >> 모든 경우의 수를 셈 (nCr 사용) : 3C2 + 2C2 + 0C2 (ex. 나머지 0: 3가지 중 2가지 고름 = 3C2)
        *                                = 3 + 1 + 0 = 4
        * 
        * => 1. (1, j)의 경우 3가지      +       2. (i+1, j)의 경우 모든 경우의 수(nCr)
        * >>>>>     3 + 4 = 총 7 가지
        * */
        long res = 0;
        long[] S = new long[n+1];
        long[] count = new long[m];

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            S[i] = (S[i-1] + Integer.parseInt(st.nextToken())) % m;
            if (S[i] == 0) res++;   // 1.

            count[(int) S[i]]++;      // 각 나머지를 카운트
        }

        for (int i=0; i<m; i++)     // 2
            if (count[i] > 1) // 나머지가 같은 경우가 2개 이상일 때,
                res += (count[i] * (count[i]-1) / 2); // nC2 계산식    // 3. (1),(2) 모두 더함

        System.out.println(res);

        br.close();


        // 이차원 구간 합 배열 => 메모리 초과...
//        // TODO : N과 M 입력
//        // - 수 N개 (A1, A2, ... , An)
//        // - 나누는 수 M
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        // TODO : A1, A2, ... , An 입력
//        // - N개의 수 An
//        st = new StringTokenizer(br.readLine());
//        long[] A = new long[n];
//        for (int i=0; i<n; i++) {
//            A[i] = Integer.parseInt(st.nextToken()); // 원본 일차원 배열
//        }
//
//        long[][] S = new long[n+1][n+1]; // 2차원 배열로 구성
//        long cnt = 0;
//        for (int i=1; i<=n; i++) {     // - 각 행별로 => 첫번째 ~ 마지막, 두번째 ~ 마지막, ... , 마지막-1 ~ 마지막 의 합을 구해 놓음
//            for (int j=i; j<=n; j++) {
//                S[i][j] = S[i][j-1] + A[j-1];
//
//                // TODO : 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수 출력
//                // - Ai + ... + Aj (i<=j) => (i,j)쌍의 개수
//                if (S[i][j] != 0 && S[i][j] % m == 0) // m으로 나누어 떨어지는 수 (구간 합이 0인 것 제외)
//                    cnt++;
//            }
//        }
//        System.out.println(cnt);
    }
}
