import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11004 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(a, 0, n-1);

        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("k=" + a[k-1]);
    }

    static void quickSort(int[] a, int left, int right) {
        if (left >= right) return;

        int pivot = partition(a, left, right-1);

        partition(a, left, pivot);
        partition(a, pivot, right);

    }

    static int partition(int[] a, int left, int right) {
        int pivot = a[left];
        int low = left;
        int high = right;

        while (left < high) {
            while (pivot > a[low]) low++;
            while (pivot < a[high]) high++;

            swap(a, left, low);
        }

        swap(a, left, low);

        return low;
    }


    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}