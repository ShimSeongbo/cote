package programmers.level1;

public class 두정수사이의합 {

    public static long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int length = max - min + 1;

        answer = (long) length * (min + max) / 2;

        return answer;
    }

    public static long solution2(int a, int b) {
        long answer = 0;
        int length = 0;

        if (a == b) {
            return a;
        }

        if (a < b) {
            length = (b - a);

            for (int i = 0; i <= length; i++) {
                answer += (a + i);
            }

            return answer;
        }

        if (a > b) {
            length = (a - b);

            for (int i = 0; i <= length; i++) {
                answer += (b + i);
            }

            return answer;
        }


        return answer;
    }
}
