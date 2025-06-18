import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기 (2차원 배열)
public class Baekjoon11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째 입력 : 표의 크기 N(행,열), 합을 구해야 하는 횟수 M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // N행 N열
        int m = Integer.parseInt(st.nextToken()); // 합 구하는 횟수 M번

        // 두번째 입력 : 2차원 배열 (x, y)의 값
        int[][] S = new int[n+1][n+1];
        for (int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=n; j++) {
                // 행 별로 구간 합을 구함 (각 행의 구간 합 = '이전 열'값 + 입력 값)
                S[i][j] = S[i][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        // 구간 합 출력해보기
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=n; j++) {
//                System.out.print(S[i][j] + " ");
//            }
//            System.out.println();
//        }

        // 세번째 입력 : 네 개의 정수(x1,y1,x2,y2) :
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()); // (x1, y1)
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken()); // (x2, y2)
            int y2 = Integer.parseInt(st.nextToken());

            int sum = 0;
            for (int x=x1; x<=x2; x++) {
                sum += S[x][y2] - S[x][y1-1]; // 각 행별로 구간 합((xi, y2) - (xi, y1-1))의 값을 구하고, 모두 더함
                /* 구간 합 :
                 (S[x2][y2] + S[x1-1][y1-1]) - (S[x1-1][y2] + S[x2][y1-1])
                  => (좌상+우하) - (우상+좌하)
                  */
            }

            // 출력 : (x1,y1)부터 (x2,y2)의 합 출력 (사각형 형태?의 합)
            System.out.println(sum);
        }

    }
}
