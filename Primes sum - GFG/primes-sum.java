//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    private static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i=2;i<num/2;i++)
            if(num%i==0)    return false;
        return true;
    }
    static String isSumOfTwo(int N){
        // code here
        
        if(N%2!=0){
            if(isPrime(N-2)) return "Yes";
            else    return "No";
        }
        int temp = N;
        while(temp-- > 0)
            if(isPrime(temp))
                if(isPrime(N-temp)) return "Yes";    
        return "No";
    }
}