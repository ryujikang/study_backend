import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Total days in Year\n365\nCircumference rate\n3.1415926535");

        bw.flush();
        bw.close();
    }
}