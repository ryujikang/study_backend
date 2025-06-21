import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 우선순위 재설정 해야함
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> {
            int abs1 = Math.abs(a);
            int abs2 = Math.abs(b);

            if (abs1 == abs2) return a > b ? 1 : -1;
            else return abs1 - abs2;
        });

        StringBuffer sb = new StringBuffer();
        for (int i=0; i<n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x != 0) {
                pQueue.add(x);
            } else {
                if (!pQueue.isEmpty())
                    sb.append(pQueue.poll() + "\n");
                else sb.append(x + "\n");
            }
        }

        System.out.println(sb);
    }
}
