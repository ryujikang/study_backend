//import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon11003 {
    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        // 새로 들어온 값을 바로 제거할 경우 존재 = 덱 사용 (큐 = 한쪽에서만 제거 가능)
        Deque<Node> D = new LinkedList<>();
        for (int i=0; i<N; i++) {
            int input = Integer.parseInt(st.nextToken());

            // 덱이 비어있지 않고, 마지막 값이 새로 들어오는 값보다 크면 => 마지막값 삭제
            while (!D.isEmpty() && D.getLast().value > input) {
                D.removeLast();
            }

            D.addLast(new Node(input, i));

            if (D.getFirst().index <= i-L) {
                D.removeFirst();
            }

            System.out.print(D.getFirst().value + " ");

        }
    }
}
