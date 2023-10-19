package programmers.level1;

public class 기사단원의무기 {

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int 약수 = 0;

        for (int i = 1; i <= number; i++) {
            약수 = 약수구하는메서드(i);

            if (limit < 약수) {
               약수 = power;
            }

            answer += 약수;
        }

        return answer;
    }

    private static int 약수구하는메서드(int number) {
        int count = 0;

        if (number == 1) {
            return 1;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0 ) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 3, 2));
    }
}
