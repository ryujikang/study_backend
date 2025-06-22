import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

/*
방문 리스트
 boolean n+1 생성 : visited

dfs (grpah, start):
    스택에 1(start) 넣기
    1->true

    스택이 빌때까지 반복 (while)
        1 pop 하고
        1이랑 연결된거 찾아 -> 2, 5

        2랑 5 스택에 넣어 (2,5 true)

for (int i=1; i<=n; i++) {
    if (!visited[[i])
        dfs(graph, i)
        cnt++





        




 */

public class Baekjoon11724 {
    static int n;
    static Stack<Integer> stack = new Stack<>();
    static boolean[] visited;
    static LinkedList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];

        graph = new LinkedList[n+1];
        for(int i=1; i<=n; i++) {
            graph[i] = new LinkedList<>();
        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }


        int cnt = 0;
        for (int i=1; i<=n; i++) {
            if (!visited[i]) {
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void dfs(int start) {
        stack.push(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            int popped = stack.pop();

            LinkedList<Integer> nodes = (LinkedList<Integer>) graph[popped];
            for (Integer node : nodes) {
                if (!visited[node]) {
                    stack.push(node);
                    visited[node] = true;
                }
            }
        }
    }
}