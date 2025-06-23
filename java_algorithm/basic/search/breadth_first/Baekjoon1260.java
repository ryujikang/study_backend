import java.io.*;
import java.util.*;

public class Baekjoon1260 {
    static int nodeN;

    static ArrayList<Integer>[] edgeList;

    static Stack<Integer> stackDFS = new Stack<>();
    static Queue<Integer> queueBFS = new LinkedList<>();

    static boolean[] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 방문 정점 우선순위 : 정점 번호가 작은 것부터 먼저 방문
        // TODO 입력 1 :
        //  1) N : 정점의 개수 (1 <= N <= 1000)
        //  2) M : 간선의 개수 (1 <= M <= 10000)
        //  3) V : 탐색 시작 정점 번호 (정점 번호는 1 ~ N / 0사용 X)
        nodeN = Integer.parseInt(st.nextToken());
        int edgeN = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        // TODO 입력 2 :
        //  1) x, y : 간선이 연결하는 두 정점의 번호 (M개의 줄 만큼)
//        edges = new LinkedList[nodeN + 1]; // (정점 번호는 1 ~ N / 0사용 X)
//        for (int i=0; i<edges.length; i++) {
//            edges[i] = new LinkedList<>();
//        }
        edgeList = new ArrayList[nodeN+1];
        for(int i=1; i<=nodeN; i++) {
            edgeList[i] = new ArrayList<>();
        }
        for (int i=0; i<edgeN; i++) { // 간선의 개수 만큼
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            edgeList[x].add(y);
            edgeList[y].add(x);
        }

        for (int i=1; i<nodeN+1; i++)
            Collections.sort(edgeList[i]);
        
        // TODO 출력 :
        //  1) DFS (깊이 우선 탐색) 결과 출력
        //  2) BFS (너비 우선 탐색) 결과 출력
        visited = new boolean[nodeN + 1]; // (정점 번호는 1 ~ N / 0사용 X)
        DFS(startNode);
        System.out.println();
        visited = new boolean[nodeN + 1]; // (정점 번호는 1 ~ N / 0사용 X)
        BFS(startNode);

        br.close();
    }

    // 깊이 우선 탐색 == 스택 사용
    static void DFS(int node) {
        stackDFS.push(node);

        while (!stackDFS.isEmpty()) {
            int nowNode = stackDFS.pop();
            System.out.print(nowNode + " ");
            for (int i : edgeList[node]) {
                if (!visited[i])
                    DFS(i);
            }
        }
    }

    // 너비 우선 탐색 == 큐 사용
    static void BFS(int node) {
        queueBFS.add(node);

        while (!queueBFS.isEmpty()) {
            int nowNode = queueBFS.poll();
            System.out.print(nowNode + " ");
            for (int i : edgeList[node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queueBFS.add(i);
                }
            }
        }

    }
}
