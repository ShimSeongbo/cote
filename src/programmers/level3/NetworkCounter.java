package programmers.level3;

public class NetworkCounter {

    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int networkCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, computers, visited);
                networkCount++;
            }
        }

        return networkCount;
    }

    private void dfs(int node, int[][] computers, boolean[] visited) {
        visited[node] = true;

        for (int i = 0; i < computers.length; i++) {
            if (computers[node][i] == 1 && !visited[i]) {
                dfs(i, computers, visited);
            }
        }
    }

    public static void main(String[] args) {
        NetworkCounter finder = new NetworkCounter();
        System.out.println(finder.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));  // 2
        System.out.println(finder.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));  // 1
    }
}
