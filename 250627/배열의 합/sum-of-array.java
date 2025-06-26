import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] a = new int[4][4];

        for (int i=0; i<4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<4; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<4; i++) {
            int sum = 0;
            for (int aa : a[i]) sum += aa;
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}