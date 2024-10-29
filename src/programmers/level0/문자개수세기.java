package programmers.level0;

public class 문자개수세기 {

    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            int c = my_string.charAt(i);

            if (c >= 65 && c <=90) {
                answer[c - 65]++;
            } else if (c >=97 && c <= 122) {
                answer[c - 71]++;
            }
        }


        return answer;
    }
}
