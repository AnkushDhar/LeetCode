class Solution {
    double[][] dp;
    public double soupServings(int N) {
        if (N >= 5000) return 1.0;
        dp = new double[N + 1][N + 1];
        for (double[] row : dp) Arrays.fill(row, -1.0);
        return eatSoup(N, N);
    }
    
    private double eatSoup(int A, int B) {
        if (A <= 0 && B > 0) return 1.0;
        if (A <= 0 && B <= 0) return 0.5;
        if (A > 0 && B <= 0) return 0.0;
        if (dp[A][B] != -1.0) return dp[A][B];
        dp[A][B] = 0.25 * (eatSoup(A - 100, B) + eatSoup(A - 75, B - 25) + eatSoup(A - 50, B - 50) + eatSoup(A - 25, B - 75));
        return dp[A][B];
    }
}

