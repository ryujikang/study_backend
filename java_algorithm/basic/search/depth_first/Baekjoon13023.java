import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon13023 {
    static ArrayList<Integer>[] arrayLists;
    static Stack<Integer> dfs = new Stack<Integer>();
    static boolean[] visited;
    static boolean cond = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arrayLists = new ArrayList[n];
        for (int i=0; i<n; i++) {
            arrayLists[i] = new ArrayList<Integer>();
        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arrayLists[a].add(b);
            arrayLists[b].add(a);
        }

        visited = new boolean[n];
        for (int i=0; i<n; i++) {
            DFS(i, 1);
            if (cond) break;
        }

        System.out.println(cond ? "1" : "0");

        br.close();
    }

    static void DFS(int node, int friends) {
        if (friends == 5 || cond) {
            cond = true;
            return;
        }
        dfs.push(node);

        while (!dfs.isEmpty()) {
            int v = dfs.pop();
            visited[v] = true;

            for (int i : arrayLists[v]) {
                if (!visited[i]) {
                    DFS(i, friends+1);
                }
            }
        }
        visited[node] = false;
    }
}
