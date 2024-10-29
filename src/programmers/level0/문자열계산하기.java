package programmers.level0;

public class 문자열계산하기 {

    public int solution(String my_string) {
        String[] split = my_string.split(" ");

        int result = Integer.parseInt(split[0]); // 첫 번째 숫자를 초기값으로 설정

        for (int i = 1; i < split.length; i += 2) {
            String operator = split[i];
            int number = Integer.parseInt(split[i + 1]);

            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            }
        }

        return result;
    }
}
