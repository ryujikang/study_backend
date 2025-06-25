import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         /*
            TODO - new StringTokenizer(br.readLine(), "-")
                    : 한 줄을 읽은 후, '-'를 기준으로 분리
                        55 , 50+40 로 분리
        */
        StringTokenizer sub = new StringTokenizer(br.readLine(), "-");

        // temp는 int형 정수의 최댓값으로 초기화 = 2,147,483,647 (약 21억)
        int sum = Integer.MAX_VALUE;
//        System.out.println("Max Value sum : " + sum);
        
        /*
           TODO - StringTokenizer.hashMoreTokens()
                    : StringTokenizer 클래스 객체에서
                        ㄴ 다음에 읽어 들일 token이 있으면 => true 반환
                        ㄴ       읽어 들일 token이 없으면 => false 반환
        */

        // '-'로 분리한 객체 sub에서 읽어들일 tokens가 있을 때까지 반복
        while (sub.hasMoreTokens()) {
            int temp = 0; // 숫자 하나를 저장할 임시변수 temp
//            System.out.println("first while() -> temp : " + temp);

             /*
                TODO - StringTokenizer(sub.nextToken(), "+")
                        : sub의 토큰을 읽어서, '+'를 기준으로 분리 후, add객체에 저장
                            ㄴ 첫번째 while : 55    -> '+'없음    =>  분리 X
                            ㄴ 두번째 while : 50+40 -> '+'있음    =>  50 , 40로 분리
            */
            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");

            // '+'로 분리한 객체 add에서 읽어들일 tokens가 있을 때까지 반복
            //      : tokens = 50 , 40 이 들어있음
            while (add.hasMoreTokens()) {
                temp += Integer.parseInt(add.nextToken()); // 읽은 토큰들을 모두 더함
//                System.out.println("second while() -> temp : " + temp);
            }

            // 처음 한번은 "sum"이 최댓값이므로, sum을 temp로 초기화
            if (sum == Integer.MAX_VALUE)
                sum = temp;
            else // 이후 결과에 temp를 빼줌
                sum -= temp;
//            System.out.println("if -> sum : " + sum);
        }

        System.out.println(sum);


    }
}
