import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] startToEnd = new int[n][2];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            startToEnd[i][0] = Integer.parseInt(st.nextToken());
            startToEnd[i][1] = Integer.parseInt(st.nextToken());
        }

        // 회의 종료시간 기준으로 오름차순 정렬
        Arrays.sort(startToEnd, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 종료 시간 같으면 -> 시작시간 빠른 순서
                if (o1[1] == o2[1]) return o1[0] - o2[0];

                return o1[1] - o2[1]; // 종료시간 빠른 순서
            }
        });

        int cnt = 0;
        int endTime = -1; // 종료시간 초기 설정
        for (int i=0; i<n; i++) {
            // 종료시간(endTime) 이후에 시작하는 회의 시작시간(startToEnd[i][0]) 찾으면,
            if (startToEnd[i][0] >= endTime) {
                endTime = startToEnd[i][1]; // 종료시간 업데이트 (찾은 회의의 종료시간([i][0])으로)
                cnt++; // 회의 카운트
            }
        }
        System.out.println(cnt);


        br.close();
    }
}
