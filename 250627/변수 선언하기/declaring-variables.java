import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 3;
        char b = 'C';
        bw.write(a + "\n" + b);

        bw.flush();
        bw.close();
    }
}