package programmers.level0;

import java.util.Arrays;

public class 수열과구간쿼리4 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int k = queries[i][2];

            for (int j = left; j <= right; j++) {
                if (j % k == 0) answer[j]++;
            }
        }

        return answer;
    }
}
