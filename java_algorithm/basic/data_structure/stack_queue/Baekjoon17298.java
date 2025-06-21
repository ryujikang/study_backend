import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Baekjoon17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int[] anwer = new int[N];
        for (int i=0; i<N; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                anwer[stack.pop()] = A[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            anwer[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(anwer[i]).append(' ');
        }

        System.out.println(sb);
    }
}
