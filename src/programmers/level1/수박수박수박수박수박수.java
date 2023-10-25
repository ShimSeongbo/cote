package programmers.level1;

public class 수박수박수박수박수박수 {


    public String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if (isOdd(i)) {
                answer += "수";
            }

            if (isEven(i)) {
                answer += "박";
            }
        }

        return answer;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
