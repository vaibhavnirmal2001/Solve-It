class Solution {
    public static int fibonacci(int n, int[] dp){
        if(n<=1) return n;

        if(dp[n]!=-1) return dp[n];

        dp[n]= fibonacci(n-1,dp)+fibonacci(n-2,dp);
        return dp[n];
    }
    public static int fib(int n) {
//         int dp[] = new int[n+1];
//         dp[0]=0;

//         if(n==0) return 0;
//         dp[1]=1;
//         if(n==1) return 1;

//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//          return dp[n];
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return fibonacci(n,dp);
    }
}