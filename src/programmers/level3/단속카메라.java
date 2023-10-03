package programmers.level3;

import java.util.Arrays;

public class 단속카메라 {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));

        int answer = 0;
        int cameraPosition = Integer.MIN_VALUE;

        for (int[] route : routes) {
            if (cameraPosition < route[0]) {
                cameraPosition = route[1];
                answer++;
            }
        }

        return answer;
    }


}
