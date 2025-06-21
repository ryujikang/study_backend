import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<n; i++) {
            queue.add(i+1);
        }

        while (queue.size() > 1) {
            queue.poll();
            int reverse = queue.poll();
            queue.add(reverse);
        }

        System.out.println(queue.poll());
    }
}
