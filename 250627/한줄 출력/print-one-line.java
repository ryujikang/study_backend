import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Let's go LeebrosCode!");

        bw.flush();
        bw.close();
    }
}