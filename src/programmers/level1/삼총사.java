package programmers.level1;

public class 삼총사 {

    /**
     * '삼총사' 가 되는 경우의 수
     * 1. 모든 경우의 수 대입해보기.
     * 2. 더 좋은 방법은?
     */
    class Solution {
        public int solution(int[] number) {
            int answer = 0;

            int i, j, k;

            for (i = 0 ; i <= number.length - 3 ; i++) {

                for (j = i + 1 ; j <= number.length - 2 ; j++) {

                    for (k = j + 1 ; k <= number.length - 1 ; k++) {
                        if ((number[i] + number[j] + number[k]) == 0) answer++;
                    }

                }

            }

            return answer;
        }
    }
}
