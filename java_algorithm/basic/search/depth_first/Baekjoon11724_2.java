import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon11724_2 {
    static Queue<Integer> queue = new LinkedList<>();
    static boolean[] visited;
    static int n;
//    static LinkedList<Integer>[] graph;graph
    static ArrayList<LinkedList<Integer>>  graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];

//        graph = new LinkedList[n+1];
        for (int i=0; i<n+1; i++) {
            graph.add(new LinkedList<>());
        }


        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int cnt = 0;
        for (int i=1; i<=n; i++) {
            if (!visited[i]) {
                BFS(i);
                cnt++;
            }
        }

        System.out.println(cnt);

        br.close();
    }

    static void BFS(int i) {
        queue.add(i);
        visited[i] = true;

        while (!queue.isEmpty()) {
            int polled = queue.poll();
            LinkedList<Integer> nodes = graph.get(polled);

            for (int node : nodes) {
                if (!visited[node]) {
                    queue.add(node);
                    visited[node] = true;
                }

            }
        }
    }
}