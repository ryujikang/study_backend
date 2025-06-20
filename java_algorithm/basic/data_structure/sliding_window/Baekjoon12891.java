import java.io.*;
import java.util.*;

public class Baekjoon12891 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO 입력1: DNA 문자열 길이 |S|, 비밀번호로 사용할 부분문자열의 길이 |P|
        //  DNA 문자 = {'A', 'C', 'G', 'T'}
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lenDNA = Integer.parseInt(st.nextToken()); // DNA 길이
        int lenPW = Integer.parseInt(st.nextToken()); // 비밀번호 길이

        // TODO 입력2: 임의로 만든 DNA 문자열
        //  ex) CCTGGATTG
        char[] str = br.readLine().toCharArray(); // 문자열 -> 문자 배열

        // TODO 입력3: 부분문자열에 포함되어야 할 {'A', 'C', 'G', 'T'}의 최소 개수 (공백 구분)
        //  * 각각의 수는 |S|보다 작거나 같은 음이 아닌 정수이며, 총 합은 |S|보다 작거나 같음이 보장됨
        //       {'A', 'C', 'G', 'T'}
        //  ex)    2    0    1    1
        st = new StringTokenizer(br.readLine());
        int[] minimums = new int[4];
        for (int i=0; i<minimums.length; i++) {
            minimums[i] = Integer.parseInt(st.nextToken());
        }
        
        // TODO 출력: 만들 수 있는 비밀번호의 종류의 수
        //  1) 부분문자열에서 등장하는 문자의 개수가 특정 개수 이상이여야 비밀번호로 사용할 수 있다
        //  2) 부분문자열이 등장하는 위치가 다르다면 부분문자열이 같다고 하더라도 다른 문자열로 취급
        int[] countMin = new int[4];
        for (int i =0; i<lenPW; i++) { // 처음 부분문자열(비밀번호)에 해당하는 알파벳 카운트
            switch (str[i]) {
                case 'A': countMin[0]++; break;
                case 'C': countMin[1]++; break;
                case 'G': countMin[2]++; break;
                case 'T': countMin[3]++; break;
            }
        }

        int res = 0; // 정답 개수
        for (int curr=0; curr<=lenDNA-lenPW; curr++) { // 윈도우 내부 문자를 차례대로 비교하며 정답 체크
            boolean isAnswer = false;

            for (int i=0; i<4; i++) {
                if (countMin[i] < minimums[i]) { // 카운트한 알파벳이 입력된 최소 개수보다 작으면,
                    isAnswer = true; // 옳바른 비밀번호
                    break;
                }
            }

            if (!isAnswer) res++;
            if (curr == lenDNA-lenPW) break;
            
            // 윈도우를 한칸 옮기기 위해 (새로 추가되는 문자 하나만 비교하면 됨)
            countMin[moveCount(str[curr])]--;       // 윈도우 맨 앞에 해당되는 문자 카운트 감소
            countMin[moveCount(str[curr+lenPW])]++; // 윈도우 바로 뒤에 해당되는 문자 카운트 증가
        }

        System.out.println(res);

        br.close();
    }

    public static int moveCount(char c) {
        switch (c) { // 문자 c에 맞는 인덱스 값 리턴
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
        }
        return -1;
    }

}
