import java.io.*;
import java.util.*;

public class Baekjoon1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO 입력1: 재료의 개수 N
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        // TODO 입력2: 갑옷을 만드는데 필요한 수 M
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        // TODO 입력3: N개의 재료들이 가진 고유한 번호 (공백으로 구분)
        st = new StringTokenizer(br.readLine());
        int[] numbering = new int[n];
        for (int i=0; i<n; i++) {
            numbering[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbering); // 오름차순 정렬
//        System.out.println(Arrays.toString(numbering));
        
        // TODO 출력: 갑옷을 만들 수 있는 개수
        int left = 0, right = n-1;
        int cnt = 0;

        for (int i=0; i<n; i++) {
            if (left < right) {
                int sum = numbering[left] + numbering[right];

                if (sum == m) {
//                    System.out.println(" left: " + left + ", right: " + right + " = " + sum);
                    cnt++;
                    left++;
                    right--;
                } else if (sum > m) {
//                    System.out.println(" left: " + left + ", right: " + right);
                    right--;
                } else if (sum < m) {
//                    System.out.println(" left: " + left + ", right: " + right);
                    left++;
                }
            }
        }
        System.out.println(cnt);

        br.close();
    }
}
