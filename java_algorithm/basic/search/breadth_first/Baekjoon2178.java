import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon2178 {
    static int[][] map;
    static int N, M;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1}; // 좌, 우
    static int[] dy = {1, 0, -1, 0}; // 상, 하

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for (int i=0; i<N; i++) {
            String line = br.readLine();
            for (int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        visited = new boolean[N][M];

        BFS(0, 0); // (0, 0) 부터 시작
        System.out.println(map[N-1][M-1]);

//        for (int i=0; i<N; i++) {
//            for (int j=0; j<M; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }

        br.close();
    }

    static void BFS(int n, int m) {
        Queue<int[]> queue = new LinkedList<>();

        // 큐에 (n, m) 좌표 추가 및 방문표시
        queue.add(new int[] {n, m});
        visited[n][m] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll(); // 큐에 추가한 좌표 => now[]에 저장

            // 상하좌우로 이동여부 판단 -> 큐에 추가
            for (int k=0; k<4; k++) {   //           상 하  좌 우
                int x = now[0] + dx[k]; // 좌우   dx {0, 1, 0, -1}
                int y = now[1] + dy[k]; // 상하   dx {1, 0, -1, 0}

                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (map[x][y] != 0 && !visited[x][y]) { // 좌표가 이동할 수 있는 길이고, 방문하지 않았으면
                        visited[x][y] = true;
                        map[x][y] = map[now[0]][now[1]] + 1; // 이동하는 좌표의 값을 현재좌표값+1 (깊이 업데이트)
                        queue.add(new int[] {x, y}); // 큐에 추가
                    }
                }
            }
        }

    }
}
