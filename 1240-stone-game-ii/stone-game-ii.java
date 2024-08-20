class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n + 1]; // dp[i][M] will store the max stones Alice can get from i-th pile with current M.
        int[] suffixSum = new int[n];   // suffixSum[i] will store the sum of stones from i to end.

        // Calculate the suffix sums
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = piles[i] + suffixSum[i + 1];
        }

        // Helper function for dynamic programming with memoization
        for (int i = n - 1; i >= 0; i--) {
            for (int M = 1; M <= n; M++) {
                if (i + 2 * M >= n) {
                    dp[i][M] = suffixSum[i]; // If Alice can take all remaining piles
                } else {
                    for (int X = 1; X <= 2 * M; X++) {
                        dp[i][M] = Math.max(dp[i][M], suffixSum[i] - dp[i + X][Math.max(M, X)]);
                    }
                }
            }
        }

        return dp[0][1]; // Start from pile 0 with M = 1
    }
}