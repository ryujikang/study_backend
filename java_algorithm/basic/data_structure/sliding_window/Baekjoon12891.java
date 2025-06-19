import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO 입력1: DNA 문자열 길이 |S|, 비밀번호로 사용할 부분문자열의 길이 |P|
        //  DNA 문자 = {'A', 'C', 'G', 'T'}
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken()); // DNA 길이
        int p = Integer.parseInt(st.nextToken()); // 비밀번호 길이

        // TODO 입력2: 임의로 만든 DNA 문자열
        //  ex) CCTGGATTG
        st = new StringTokenizer(br.readLine());
        String tempString = st.nextToken().toString(); // 임의 DNA 문자열 (길이는 s)
//        System.out.println(tempString);

        // TODO 입력3: 부분문자열에 포함되어야 할 {'A', 'C', 'G', 'T'}의 최소 개수 (공백 구분)
        //  * 각각의 수는 |S|보다 작거나 같은 음이 아닌 정수이며, 총 합은 |S|보다 작거나 같음이 보장됨
        //       {'A', 'C', 'G', 'T'}
        //  ex)    2    0    1    1
        st = new StringTokenizer(br.readLine());
        int[] minimums = new int[4];
        for (int i=0; i<minimums.length; i++) {
            minimums[i] = Integer.parseInt(st.nextToken());
//            System.out.print(cnt[i] + " ");
        }
        
        // TODO 출력: 만들 수 있는 비밀번호의 종류의 수
        //  1) 부분문자열에서 등장하는 문자의 개수가 특정 개수 이상이여야 비밀번호로 사용할 수 있다
        //  2) 부분문자열이 등장하는 위치가 다르다면 부분문자열이 같다고 하더라도 다른 문자열로 취급

        br.close();
    }
}
