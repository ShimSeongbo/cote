package programmers.level1;

import java.util.Arrays;

public class 예산 {

    public int solution(int[] d, int budget) {
        int answer = 0;
        int money = budget;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (money >= d[i]) {
                money -= d[i];
                answer++;
            } else {
                return answer;
            }
        }

        return answer;
    }
}
