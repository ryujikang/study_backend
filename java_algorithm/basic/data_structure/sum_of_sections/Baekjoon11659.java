/*구간 합 :
*   합 배열을 이용하여 시간 복잡도를 줄이기 위해 사용하는 특수한 목적의 알고리즘
* 
* 합 배열 S 정의 : 기존 배열을 전처리한 배열
*   S[i] = A[0] + A[1] + ... + A[i-1] + A[i]
*
* 합 배열을 미리 구해놓으면 => 기존 배열의 일정 범위의 합을 구하는 시간복잡도가 감소 O(N) -> O(1)
*
* <공식>
* 합 배열 S :
*   S[i] = S[i-1] + A[i]
* 구간 합 : i에서 j까지 구간 합
*   S[j] + S[i-1]
*
* */

/*BufferedReader & BufferedWriter
* 
* BufferedReader : Scanner와 유사 (단, Enter만 경계로 인식함 = String 데이터로 고정 => 가공 작업 필요)
* BufferedWriter : System.out.println()과 유사
*
* 필요한 import문 :
* - import java.io.BufferedReader;
* - import java.io.BufferedWriter;
* - import java.io.InputStreamReader;
* - import java.io.OutputStreamWriter;
*
* - import java.util.StringTokenizer;
* - import java.io.IOException;
*
*
* main 클래스 옆에 throws IOException를 작성한다.
*   public static void main(String[] args) throws IOException {}
*
*
* 사용 예시 (입력 및 가공)
*   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
*   String s = bf.readLine();                 //String으로 입력받음
*   int i = Integer.parseInt(bf.readLine());  //Int으로 변환
*
* 공백 단위로 가공 예시
*   방법 1
*       StringTokenizer st = new StringTokenizer(s);  //StringTokenizer인자값에 입력 문자열 넣음
*       int a = Integer.parseInt(st.nextToken());     //첫번째 호출
*       int b = Integer.parseInt(st.nextToken());     //두번째 호출
*   방법2
*       String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
* 
* 사용 예시 (출력)
*   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //할당된 버퍼에 값 넣어주기
*   String s = "abcdefg"; //출력할 문자열
*   bw.write(s+"\n");     //버퍼에 있는 값 전부 출력
*   bw.flush();           //남아있는 데이터를 모두 출력시킴
*   bw.close();           //스트림을 닫음
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기
public class Baekjoon11659{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()); // 문자열(한줄)을 읽고 -> 공백 기준으로 잘라서 토큰(조각) 단위로 처리 -> st에 저장
        int n = Integer.parseInt(st.nextToken()); // 토큰을 읽고, 수의 개수 n에 int로 저장
        int m = Integer.parseInt(st.nextToken()); // 토큰을 읽고, 합을 구해야 하는 횟수 m에 int로 저장

        st = new StringTokenizer(br.readLine()); // 다시 한줄을 읽고, 토큰 단위로 저장
        int[] S = new int[n+1]; // 구간 합 배열 S 생성
        for (int i=1; i<=n; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken()); // 토큰을 하나씩 읽어서 구간 합 배열 S에 저장
        }

        for (int q=0; q<m; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()); // i번째
            int j = Integer.parseInt(st.nextToken()); // j번째
            System.out.println(S[j] - S[i-1]); // i부터 j까지의 합 출력
        }

        br.close();
    }
}
