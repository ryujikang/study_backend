import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 7, b = 23, c = 30;
        bw.write(a + " + " + b + " = " + c);

        bw.flush();
        bw.close();
    }
}