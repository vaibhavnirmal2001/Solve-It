import java.util.*;

public class CandyProblem {
//    public static int maxCandy( int a, int b, int[] arr){
//        Arrays.sort(arr);
//        return arr[arr.length-2];
//    }
//    public static void main(String[] args) {
//        int a=1;
//        int b=2;
//        int[] arr = new int[]{26,20,23};
//
//        System.out.println(maxCandy(a,b,arr));
//    }
public static int nCr(int n, int r, int mod){
    if(r>n)return 0;
    if((n-r) < r) r = n-r;


    int[] dp = new int[r+1];

    Arrays.fill(dp,0);
    dp[0] = 1;
    for(int i=1;i<=n;i++){
        for(int j=(Math.min(r,i));j>0;j--){
            dp[j] = (dp[j] + dp[j-1])%mod;
        }
    }

    return dp[r];
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        int m= sc.nextInt();
        System.out.println(nCr(n,r,m));

    }
}
