package programmers.level1;

import java.util.Arrays;

public class 과일장수 {

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int totalBoxes = score.length / m;

        for (int i = 1; i <= totalBoxes; i++) {
            int p = score[score.length - i * m];
            answer += p * m;
        }

        return answer;
    }
}
