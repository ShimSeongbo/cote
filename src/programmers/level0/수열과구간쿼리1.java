package programmers.level0;


public class 수열과구간쿼리1 {

    public int[] solution(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
                int min = queries[i][0];
                int max = queries[i][1];

                for (int j = min; j <= max; j++) {
                    arr[j]++;
                }
            }

        return arr;
    }
}
