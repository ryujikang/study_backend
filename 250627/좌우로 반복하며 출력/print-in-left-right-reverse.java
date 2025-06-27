import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++) {
            int cnt = n;
            for (int j=1; j<=n; j++) {
                if (i%2==1) bw.write(j + "");
                else bw.write(cnt-- + "");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}