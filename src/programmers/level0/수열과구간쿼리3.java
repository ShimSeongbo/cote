package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 수열과구간쿼리3 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }

        return answer;
    }
}
