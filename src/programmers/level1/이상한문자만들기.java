package programmers.level1;

public class 이상한문자만들기 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                count = 0;
                answer.append(' ');
            } else {
                if (isEven(count)) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                count++;
            }
        }

        return answer.toString();
    }

    static boolean isEven(int count) {
        return count % 2 == 0;
    }
}
