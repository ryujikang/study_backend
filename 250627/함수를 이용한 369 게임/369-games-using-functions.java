import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i=a; i<=b; i++) {
            if (i%3==0 || isCorrect(i)) {
                cnt++;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }

    static boolean isCorrect(int n) {
        char[] temp = ("" + n).toCharArray();

        boolean flag = true;

        for (char c : temp) {
            switch (c) {
                case '3':
                case '6':
                case '9':
                    return true;
                default:
                    flag = false;
            }
        }

        return flag;
    }
}