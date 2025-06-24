import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2343 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int start = 0, end = 0;
        int[] times = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            times[i] = Integer.parseInt(st.nextToken());

            if (times[i] > start)
                start = times[i]; // 레슨 최대시간
            end += times[i];  // 모든 레슨시간의 합
        }

        while (start <= end) {
            int mid = (start+end) / 2;
            int sum = 0, cnt = 0;

            for (int i=0; i<n; i++) {
                if (sum + times[i] > mid) {
                    cnt++;
                    sum = 0;
                }
                sum += times[i];
            }

            if (sum != 0) cnt++;
            if (cnt > m) start = ++mid;
            else end = --mid;
        }

        System.out.println(start);

        br.close();
    }
}
