import java.util.*;

public class Main {

    static int N, M;
    static int[][] grid;
    static boolean[][] visited;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static List<Integer> selected = new ArrayList<>();
    static Set<String> seen = new HashSet<>();
    static List<int[]> modules = new ArrayList<>();
    static List<Integer> scores = new ArrayList<>();

    static int answer = Integer.MIN_VALUE;

    static void dfs() {
        if (selected.size() == 5) {
            int[] cells = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                cells[i] = selected.get(i);
            }

            // 정렬하여 Set에 저장을 통해서 중복 선택 제거
            Arrays.sort(cells);
            String key = Arrays.toString(cells);

            if (seen.add(key)) {
                for (int cell : cells) {
                    sum += grid[cell / M][cell % M];
                }

                modules.add(cells);
                scores.add(sum);
            }
            return;
        }

        // 현재 선택된 모든 칸에서 확장
        Set<Integer> candidates = new HashSet<>();

        for (int cell : selected) {
            int r = cell / M;
            int c = cell % M;

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr < 0 || nr >= N ||
                    nc < 0 || nc >= M) continue;

                if (!visited[nr][nc]) {
                    candidates.add(nr * M + nc);
                }
            }
        }

        for (int next : candidates) {
            int r = next / M;
            int c = next % M;

            visited[r][c] = true;
            selected.add(next);

            dfs();

            selected.remove(selected.size() - 1);
            visited[r][c] = false;
        }
    }

    static boolean overlap(int[] a, int[] b) {
        int count = 0;
        int i = 0, j = 0;

        while (i < 5 && j < 5) {
            if (a[i] == b[j]) {
                count++;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
            if (count > 2) return false;
        }

        if (count == 2) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        grid = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // 모든 위치에서 모듈 생성
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                visited[r][c] = true;
                selected.add(r * M + c);

                dfs();

                selected.clear();
                visited[r][c] = false;
            }
        }

        // 두 모듈 조합 검사
        for (int i = 0; i < modules.size(); i++) {
            for (int j = i + 1; j < modules.size(); j++) {

                if (!overlap(modules.get(i), modules.get(j))) {
                    continue;
                }

                int sum = scores.get(i) + scores.get(j);
                answer = Math.max(answer, sum);
            }
        }

        System.out.println(answer);
    }
}