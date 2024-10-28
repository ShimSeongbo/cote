package programmers.level0;

public class Seven의개수 {

    public int solution(int[] array) {
        int answer = 0;

        for (int i : array) {
            String s = String.valueOf(i);

            for (int j = 0; j < s.length(); j++) {
                if ('7' == s.charAt(j)) answer++;
            }
        }

        return answer;
    }
}
