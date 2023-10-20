package programmers.level1;

public class 기사단원의무기 {

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int 약수 = 약수구하는메서드(i);

            if (약수 > limit) {
               약수 = power;
            }

            answer += 약수;
        }

        return answer;
    }

    private static int 약수구하는메서드(int number) {
        if (number == 1) {
            return 1;
        }

        int count = 2;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count += (i == number / i) ? 1 : 2;
            }
        }

        return count;
    }
}
