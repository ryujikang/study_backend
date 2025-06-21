import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        data[] A = new data[N];
        for (int i = 0; i < N; i++) {
            A[i] = new data(Integer.parseInt(br.readLine()), i); // 초기 인덱스값도 같이 저장
        }

        Arrays.sort(A); // 값을 가준으로 오름차순 정렬

        int m = 0;
        for (int i = 0; i < N; i++) {
            if (m < A[i].idx - i) {
                m = A[i].idx - i; // "정렬 전 인덱스값"과 "정렬 후 인덱스 값" 차이가 가장 큰 거 찾기
            }
        }

        System.out.println(m+1); // +1을 해줌 (문제의 예제 코드 -> swap이 일어나지 않는 마지막 횟수 추가)
    }
}

class data implements Comparable<data> {
    int val;
    int idx;

    public data(int val, int idx) {
        super();
        this.val = val;
        this.idx = idx;
    }

    @Override
    public int compareTo(data data) {
        return this.val - data.val;
    }

}
