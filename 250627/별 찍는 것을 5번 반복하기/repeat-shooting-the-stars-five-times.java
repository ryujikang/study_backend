import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=0; i<5; i++) {
            for (int j=0; j<10; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}