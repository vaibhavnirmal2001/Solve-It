//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.maxSumLCM(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long maxSumLCM(int n) {
        long sum = 0;
        long m = n;
        for(long i=1; i*i<=m; ++i){
            if(m%i == 0){
                sum += i;
                long rem = m/i;
                if(rem != i){
                    sum += rem;
                }
            }
        }
        return sum;
    }
}