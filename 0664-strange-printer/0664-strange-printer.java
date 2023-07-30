class Solution {
    public int strangePrinter(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Base case: One character requires one turn.
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Bottom-up dynamic programming
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = len; // Initialize with a large value as an upper bound.

                // Check if substring ends with the same character, then reduce the turns.
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i][j - 1];
                    continue;
                }

                // Try all possible divisions and take the minimum.
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j]);
                }
            }
        }

        return dp[0][n - 1];
    }
}
