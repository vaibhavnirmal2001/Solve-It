class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
    for (int i = 1; i <= n; i++) {
        dp[i] = Integer.MAX_VALUE;
    }
    
    for (int i = 1; i <= n; i++) {
        int sqrt = (int)Math.sqrt(i);
        
        // If the number is already a perfect square,
        // then dp[number] can be 1 directly. This is
        // just a optimization for this DP solution.
        if (sqrt * sqrt == i) {
            dp[i] = 1;
            continue;                
        }
        
        // To get the value of dp[n], we should choose the min
        // value from:
        //     dp[n - 1] + 1,
        //     dp[n - 4] + 1,
        //     dp[n - 9] + 1,
        //     dp[n - 16] + 1
        //     and so on...
        for (int j = 1; j <= sqrt; j++) {
            int dif = i - j * j;
            dp[i] = Math.min(dp[i], (dp[dif] + 1));
        }
    }
    
    return dp[n];
    }
}