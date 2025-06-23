import java.io.*;

public class Baejoon2023 {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);

        br.close();
    }

    static void DFS(int num, int depth) {
        if (depth == n) {
            if (isPrime(num))
                System.out.println(num);
            return;
        }

        for (int i=1; i<=9; i++) {
            if (i%2!=0 && isPrime(num*10+i)) {
                DFS(num*10 + i, depth+1);
            }
        }
    }

    static boolean isPrime(int num) {
        for (int i=2; i<=num/2; i++) {
            if (num%i==0)
                return false;
        }
        return true;
    }
}
