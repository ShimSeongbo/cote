package programmers.level3;

public class 등굣길 {
    public int solution(int m, int n, int[][] puddles) {
        final int MOD = 1000000007;
        int[][] dp = new int[n + 1][m + 1];

        for (int[] puddle : puddles) {
            dp[puddle[1]][puddle[0]] = -1;
        }

        dp[1][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }
                if (i != 1) dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
                if (j != 1) dp[i][j] = (dp[i][j] + dp[i][j - 1]) % MOD;
            }
        }
        return dp[n][m];
    }

}
