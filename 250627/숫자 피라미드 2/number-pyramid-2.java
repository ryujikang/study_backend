import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n =Integer.parseInt(br.readLine());

        int cnt=1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                bw.write(cnt++ + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}