package programmers.level0;

public class 잘라서배열로저장하기 {

    public String[] solution(String my_str, int n) {
        int length = (my_str.length() + n - 1) / n;
        String[] answer = new String[length];

        for (int i = 0; i < length; i++) {
            int start = i * n;
            int end = Math.min(start + n, my_str.length());

            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
