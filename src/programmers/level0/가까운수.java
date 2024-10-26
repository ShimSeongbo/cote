package programmers.level0;

public class 가까운수 {

    public int solution(int[] array, int n) {
        int answer = array[0];
        int minGap = Math.abs(n - answer);

        for (int i : array) {
            int currentGap = Math.abs(n - i);

            if (currentGap < minGap || (currentGap == minGap && i < answer)) {
                answer = i;
                minGap = currentGap;
            }
        }

        return answer;
    }
}
