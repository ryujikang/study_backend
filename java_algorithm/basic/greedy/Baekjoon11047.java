import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coinWorth = new int[n];
        for (int i=0; i<n; i++) {
            coinWorth[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i=n-1; i>=0; i--) {
            if (k >= coinWorth[i]) {
                cnt += k / coinWorth[i];
                k %= coinWorth[i];
            }
        }
        System.out.println(cnt);


    }
}
