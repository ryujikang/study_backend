import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start =Integer.parseInt(st.nextToken());
        int end =Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i=start; i<=end; i++) {
            int t2 = 0;

            for (int j=1; j<=i; j++) {
                if (i%j==0) t2++;
            }

            if (t2 == 3) cnt++;
        }
        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}