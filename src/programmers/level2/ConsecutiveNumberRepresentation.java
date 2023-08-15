package programmers.level2;

public class ConsecutiveNumberRepresentation {
    public int solution(int n) {
        int answer = 0;
        int start = 1, end = 1, sum = 1;

        while (start <= n) {
            if (sum < n) {
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start++;
            } else {
                answer++;
                end++;
                sum += end;
            }
        }

        return answer;
    }

    /**
     * -정수론 정리-
     * "주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다"
     *
     * @param args
     */
    public int expressions(int num) {
        int answer = 0;

        for (int i = 1; i <= num; i += 2)
            if (num % i == 0)
                answer++;

        return answer;
    }

    public static void main(String[] args) {
        ConsecutiveNumberRepresentation sol = new ConsecutiveNumberRepresentation();
        System.out.println(sol.solution(15)); // Output: 4
    }
}
