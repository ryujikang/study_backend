import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1920 {
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = new int[n];
        for (int i=0; i<n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] find = new int[m];
        for (int i=0; i<m; i++) {
            find[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<m; i++) {
            if (binarySearch(find[i]) != -1)
                System.out.println("1");
            else
                System.out.println("0");
        }

        br.close();
    }

    static int binarySearch(int key) {
        int left = 0;
        int right = A.length-1;

        while (left <= right) {
            int mid = (left+right)/2;

            if (A[mid] < key) {
                left = mid+1;
            }
            else if (key < A[mid]) {
                right = mid-1;
            } else
                return mid;
        }

        return -1;
    }

}
