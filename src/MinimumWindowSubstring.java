import java.util.Arrays;

public class MinimumWindowSubstring {
    public static int fibonacci(int n, int[] dp){
        if(n<=1) return n;

        if(dp[n]!=-1) return dp[n];

        dp[n]= fibonacci(n-1,dp)+fibonacci(n-2,dp);
        return dp[n];
    }
    public static int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return fibonacci(n,dp);
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
