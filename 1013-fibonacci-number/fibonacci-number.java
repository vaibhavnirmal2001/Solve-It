class Solution {
    public static int getNthFibo(int n, int[] dp){
        if (n==0) return 0;
        if (n==1) return 1;
        if (dp[n]!=-1) return dp[n];
        dp[n]= getNthFibo(n-1,dp)+getNthFibo(n-2,dp);
        return dp[n];
    }
    public int fib(int n) {
         int[] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            dp[i]=-1;
        }
        return getNthFibo(n,dp);
    }
}