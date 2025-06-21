import java.io.*;
import java.util.Stack;

public class Baekjoon1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean isOK = true;

        for (int i=0; i<n; i++) {
            int curr = arr[i];
            if (curr >= num) {
                while (curr >= num) {
                    stack.push(num++);
                    bw.write("+\n");
                }
                stack.pop();
                bw.write("-\n");
            } else {
                int no = stack.pop();
                if (no > curr) {
                    System.out.println("NO");
                    isOK = false;
                    break;
                } else {
                    bw.write("-\n");
                }
            }
        }
        if (isOK) bw.flush();
    }
}