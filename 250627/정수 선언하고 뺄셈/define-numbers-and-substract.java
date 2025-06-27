import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 97, b = 13;
        bw.write(a + " - " + b + " = " + (a-b));

        bw.flush();
        bw.close();
    }
}