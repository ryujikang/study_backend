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

        int sum = 0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<=i; j++) {
                sum += a[i][j];
            }
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}