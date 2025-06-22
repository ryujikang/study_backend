import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N명의 사람들
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] P = new int[n];
        for (int i=0; i<n; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        // 삽입 정렬
        for (int i=1; i<n; i++) {
            int k = i;
            for (int j=i-1; j>=0; j--) {
                if (P[j] < P[k]) {
                    break;
                } else {
                    int temp = P[j];
                    P[j] = P[k];
                    P[k] = temp;
                    k--;
                }
            }
        }

        int sum = 0, p = 0;
        for (int i=0; i<n; i++) {
            sum += P[i];
            p += sum;
        }
        System.out.print(p);

        br.close();
    }
}
