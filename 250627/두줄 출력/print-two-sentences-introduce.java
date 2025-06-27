import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello students!\nWelcome to LeebrosCode!");

        bw.flush();
        bw.close();
    }
}