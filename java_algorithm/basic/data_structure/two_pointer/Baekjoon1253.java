import java.io.*;
import java.util.*;

public class Baekjoon1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO 입력1: 수의 개수 N
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        // TODO 입력2: i번째 수를 나타내는 Ai (N개)
        st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for (int i=0; i<n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
//        System.out.println(Arrays.toString(A));
        
        // TODO 출력: '좋은 수'의 개수
        // '좋은 수': N개의 수 중 어떤 수가 -> '다른 수 두 개의 합'으로 나타낼 수 있다면 '좋다(GOOD)'고 함
        //            수의 위치가 다르면, 값이 같아도 다른 수
        int cnt=0;
        for (int idx=0; idx<n; idx++) {
            int left=0, right=n-1;

            while (left < right) {
                int sum = A[left] + A[right];

                if (sum == A[idx]) {
                    if (left != idx && right != idx) {
                        cnt++;
//                    System.out.println(A[left] + " + " + A[right] + " = " + sum + "(" + left + ", " + right + ") -> index: " + idx);
                        break;
                    } else if (left == idx){
                        left++;
                    } else if (right == idx) {
                        right--;
                    }
                } else if (sum > A[idx]) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        System.out.println(cnt);

        br.close();
    }
}
