import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] n = br.readLine().toCharArray();

        int[] arr = new int[n.length];
        for (int i=0; i<n.length; i++) {
            arr[i] = n[i]-'0';
//            System.out.print(arr[i] + " ");
        }

        // TODO: 선택정렬

        for (int i=0; i<n.length; i++) {
            int maxIdx = i;
            for (int j=i+1; j<n.length; j++) {
                if (arr[j] > arr[maxIdx])
                    maxIdx = j;
            }

            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        for(int i=0; i<n.length; i++)
            System.out.print(arr[i]);

        br.close();
    }
}
