package programmers.level3;

import java.util.Arrays;

class TrianglePathWithDP {
    public int solution(int[][] triangle) {
        int n = triangle.length;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int left = (j == 0) ? 0 : triangle[i-1][j-1];
                int up = (j == i) ? 0 : triangle[i-1][j];

                triangle[i][j] += Math.max(left, up);
            }
        }

        return Arrays.stream(triangle[n-1]).max().getAsInt();
    }

    public static void main(String[] args) {
        TrianglePathWithDP solution = new TrianglePathWithDP();
        int[][] triangle = {
                {7},
                {3, 8},
                {8, 1, 0},
                {2, 7, 4, 4},
                {4, 5, 2, 6, 5}
        };

        System.out.println(solution.solution(triangle)); // 30
    }
}
