import java.util.*;

public class MyPortfolioSofaProblem {

    static class State {
        int r1, c1, r2, c2;
        State(int r1, int c1, int r2, int c2) {
            // Always sort to keep consistency
            if (r1 < r2 || (r1 == r2 && c1 <= c2)) {
                this.r1 = r1; this.c1 = c1;
                this.r2 = r2; this.c2 = c2;
            } else {
                this.r1 = r2; this.c1 = c2;
                this.r2 = r1; this.c2 = c1;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof State)) return false;
            State s = (State) o;
            return r1 == s.r1 && c1 == s.c1 && r2 == s.r2 && c2 == s.c2;
        }

        @Override
        public int hashCode() {
            return Objects.hash(r1, c1, r2, c2);
        }
    }

    static int M, N;
    static char[][] grid;

    static boolean isFree(int r, int c) {
        return (r >= 0 && r < M && c >= 0 && c < N && grid[r][c] != 'H');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        grid = new char[M][N];

        List<int[]> startList = new ArrayList<>();
        List<int[]> endList = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.next().charAt(0);
                if (grid[i][j] == 's') {
                    startList.add(new int[]{i, j});
                } else if (grid[i][j] == 'S') {
                    endList.add(new int[]{i, j});
                }
            }
        }

        State start = new State(startList.get(0)[0], startList.get(0)[1],
                                startList.get(1)[0], startList.get(1)[1]);
        State end = new State(endList.get(0)[0], endList.get(0)[1],
                              endList.get(1)[0], endList.get(1)[1]);

        int result = bfs(start, end);
        if (result == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(result);
        }
    }

    static int bfs(State start, State end) {
        Queue<State> q = new LinkedList<>();
        Queue<Integer> dist = new LinkedList<>();
        Set<State> visited = new HashSet<>();

        q.add(start);
        dist.add(0);
        visited.add(start);

        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        while (!q.isEmpty()) {
            State cur = q.poll();
            int steps = dist.poll();

            if (cur.equals(end)) return steps;

            int r1 = cur.r1, c1 = cur.c1, r2 = cur.r2, c2 = cur.c2;
            boolean horiz = (r1 == r2);

            // Try moves
            for (int[] d : dirs) {
                int nr1 = r1 + d[0], nc1 = c1 + d[1];
                int nr2 = r2 + d[0], nc2 = c2 + d[1];
                if (isFree(nr1, nc1) && isFree(nr2, nc2)) {
                    State ns = new State(nr1, nc1, nr2, nc2);
                    if (!visited.contains(ns)) {
                        visited.add(ns);
                        q.add(ns);
                        dist.add(steps + 1);
                    }
                }
            }

            // Try rotations
            if (horiz) {
                // horizontal → vertical possible if 2x2 block free
                for (int d = -1; d <= 1; d += 2) {
                    if (isFree(r1 + d, c1) && isFree(r2 + d, c2)) {
                        State ns1 = new State(r1, c1, r1 + d, c1);
                        State ns2 = new State(r2, c2, r2 + d, c2);
                        if (!visited.contains(ns1)) {
                            visited.add(ns1);
                            q.add(ns1);
                            dist.add(steps + 1);
                        }
                        if (!visited.contains(ns2)) {
                            visited.add(ns2);
                            q.add(ns2);
                            dist.add(steps + 1);
                        }
                    }
                }
            } else {
                // vertical → horizontal
                for (int d = -1; d <= 1; d += 2) {
                    if (isFree(r1, c1 + d) && isFree(r2, c2 + d)) {
                        State ns1 = new State(r1, c1, r1, c1 + d);
                        State ns2 = new State(r2, c2, r2, c2 + d);
                        if (!visited.contains(ns1)) {
                            visited.add(ns1);
                            q.add(ns1);
                            dist.add(steps + 1);
                        }
                        if (!visited.contains(ns2)) {
                            visited.add(ns2);
                            q.add(ns2);
                            dist.add(steps + 1);
                        }
                    }
                }
            }
        }
        return -1; // Impossible
    }
}
