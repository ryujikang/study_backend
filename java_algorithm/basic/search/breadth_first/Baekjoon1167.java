import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1167 {
    static class Node {
        int nodeNumber;
        int distance;

        public Node(int nodeNumber, int distance) {
            this.nodeNumber = nodeNumber;
            this.distance = distance;
        }
    }

    static int v;
    static boolean[] visited;
    static ArrayList<Node>[] arrayList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정점의 개수
        v = Integer.parseInt(br.readLine());

        /*
                  1
                  | (2)
                  3
                  | (3)
                  4
             (4) / \ (6)
                2   5
        */
        arrayList = new ArrayList[v+1];
        for (int i = 1; i <= v; i++) {
            arrayList[i] = new ArrayList<>();
        }

        for (int i=1; i<=v; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());

            while (true) {
                int nodeNumber = Integer.parseInt(st.nextToken());
                if (nodeNumber == -1) break;
                int distance = Integer.parseInt(st.nextToken());

                arrayList[from].add(new Node(nodeNumber, distance));
            }
        }

        Node findNode = BFS(1);
        Node res = BFS(findNode.nodeNumber);

        System.out.println(res.distance);

        br.close();
    }

    static Node BFS(int start) {
        visited = new boolean[v + 1];
        Queue<Node> queue = new LinkedList<>();

        Node farthest = new Node(start, 0);
        queue.add(farthest);
        visited[start] = true;

        while (!queue.isEmpty()) {
            Node now = queue.poll();

            if (now.distance > farthest.distance) farthest = now;

            for (Node next : arrayList[now.nodeNumber]) {
                if (!visited[next.nodeNumber]) {
                    queue.add(new Node(next.nodeNumber, now.distance + next.distance));
                    visited[next.nodeNumber] = true;
                }
            }
        }

        return farthest;
    }
}
