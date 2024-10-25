package programmers.level0;

public class 이차원으로만들기 {

    public int[][] solution(int[] num_list, int n) {

        int k = num_list.length / n;
        int[][] result = new int[k][n];
        int count = 0;

        // n * k 배열
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[count++];
            }
        }

        return result;
    }
}
