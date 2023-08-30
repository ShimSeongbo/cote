package programmers.level2;
public class 멀리뛰기 {
    public long solution(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        
        return dp[n];
    }

    public static void main(String[] args) {
        멀리뛰기 s = new 멀리뛰기();
        System.out.println(s.solution(4)); // Should print 5
        System.out.println(s.solution(3)); // Should print 3
    }
}
