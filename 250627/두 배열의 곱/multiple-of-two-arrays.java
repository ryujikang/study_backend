import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<3; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.readLine();
        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<3; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                bw.write(a[i][j]*b[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}