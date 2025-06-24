import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Baekjoon1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i=0; i<n; i++) {
            int cards = Integer.parseInt(br.readLine());
            priorityQueue.add(cards);
        }

        int sum = 0, min1, min2;
        while (priorityQueue.size() != 1) {
            min1 = priorityQueue.poll();
            min2 = priorityQueue.poll();
            sum += min1 + min2;
            priorityQueue.add(min1 + min2);
        }

        System.out.println(sum);

        br.close();
    }
}
