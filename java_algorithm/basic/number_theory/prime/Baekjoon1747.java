import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon1747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 배열 arr의 크기를 10000001로 설정하고, boolean 타입 배열로 소수를 표시하는 방법을 사용한다.
        boolean[] arr = new boolean[10000001];

        // 소수를 담을 리스트
        List<Integer> list = new ArrayList<>();

        // 에라토스테네스의 체 알고리즘을 이용하여 소수를 구하고, 소수 중 팰린드롬인 수를 찾는다.
        for (int i = 2; i <= arr.length - 1; i++) {
            // i가 n 이상이고, 아직 소수로 판별되지 않은 경우 리스트에 추가한다.
            if (i >= n && !arr[i])
                list.add(i);

            // i의 배수들을 소수에서 제외하기 위해 arr 배열에서 true로 표시한다.
            for (int j = i + i; j <= 10000000; j += i) {
                arr[j] = true;
            }
        }

        // 리스트에 있는 소수들을 순회하면서 팰린드롬인 수를 출력한다.
        for (int i : list) {
            String num = String.valueOf(i);
            String reversed = new StringBuilder(num).reverse().toString();

            // num과 reversed가 같으면 팰린드롬인 수이므로 출력하고 종료한다.
            if (num.equals(reversed)) {
                System.out.println(num);
                return;
            }
        }

    }

    /* TODO : 에라토스테네스의 체 (소수판별 알고리즘)
        1) 2부터 N까지의 수를 나열한다.
        2) 2부터 가장 작은 수를 소수로 정하고 2의 배수를 모두 지운다.
        3) 지우지 않은 수 중에서 가장 작은 수(3)를 소수로 정하고 그 배수(3의 배수)를 지운다.
        ,
        => 이렇게 하나씩 지워나가다 보면, "지워지지 않는 수"들이 바로 "소수"
    */
    /*
    static boolean[] eratosthenes(int n) {
        boolean[] prime = new boolean[n+1];
        prime[0] = false;
        prime[1] = false;

        for (int i=2; i<=10000000; i++) {
            if (i >= n && !prime[i])
                list.add(i);

            for (int j=i+i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }

        return prime;
    }*/
}
