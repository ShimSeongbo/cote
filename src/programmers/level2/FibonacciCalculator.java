package programmers.level2;

public class FibonacciCalculator {

    private static final int MOD = 1234567;

    public int solution(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prevPrev = 0;
        int prev = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = (prev + prevPrev) % MOD;
            prevPrev = prev;
            prev = current;
        }

        return current;
    }

    public static void main(String[] args) {
        FibonacciCalculator calculator = new FibonacciCalculator();
        System.out.println(calculator.solution(3));  // 2
        System.out.println(calculator.solution(5));  // 5
    }
}
