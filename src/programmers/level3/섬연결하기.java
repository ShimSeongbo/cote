package programmers.level3;

import java.util.Arrays;

class 섬연결하기 {
    // 유니온 파인드를 위한 부모 노드 찾기 함수
    public int find(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        }
        return find(parent, parent[i]);
    }

    // 유니온 파인드를 위한 두 노드 합치기 함수
    public void union(int[] parent, int x, int y) {
        int xRoot = find(parent, x);
        int yRoot = find(parent, y);
        parent[yRoot] = xRoot;
    }

    public int solution(int n, int[][] costs) {
        // 간선들을 비용에 따라 오름차순 정렬
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);

        // 각 정점의 부모 노드를 자기 자신으로 초기화
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int answer = 0;
        // 간선을 하나씩 확인하면서 사이클이 형성되지 않는 경우에만 선택
        for (int[] cost : costs) {
            int x = find(parent, cost[0]);
            int y = find(parent, cost[1]);
            if (x != y) {
                union(parent, x, y);
                answer += cost[2];
            }
        }

        return answer;
    }
}
