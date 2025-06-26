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

        int cnt = 0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (a[i][j]%5==0) cnt++;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}