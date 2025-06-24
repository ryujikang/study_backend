import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Baekjoon1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> plusNum = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minusNum = new PriorityQueue<>(); // 음수 절댓값이 커야함 (<- 곱하기)
        int one = 0, zero = 0;
        for (int i=0; i<n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x > 1) plusNum.add(x);
            else if (x < 0) minusNum.add(x);
            else if (x == 0) zero++;
            else one++;
        }

        int sum = 0;
        while (plusNum.size() > 1) {
            sum += plusNum.poll() * plusNum.poll(); // 양수 * 양수 (2이상)
        }
        if (!plusNum.isEmpty())
            sum += plusNum.poll(); // 남은 양수(2이상) 데이터 더함

        while (minusNum.size() > 1) {
            sum += minusNum.poll() * minusNum.poll(); // 음수 * 음수
        }
        if (!minusNum.isEmpty()) {
            if (zero == 0) sum += minusNum.poll(); // 0이 없으면, 남은 음수 데이터 더함
        }

        sum += one; // 남은 1개수만큼 더함

        System.out.println(sum);

    }
}
