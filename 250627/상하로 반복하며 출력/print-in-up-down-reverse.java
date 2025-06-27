import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt1 = 1, cnt2 = n;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (j%2==1) bw.write(cnt1 + "");
                else bw.write(cnt2 + "");
            }
            cnt1++;
            cnt2--;
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}