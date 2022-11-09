//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{
	    int sum = 0;
	    
	    for(int x : arr) sum += x;
	    
	    
	    boolean prev[] = new boolean[sum+1];
	    
	    prev[0] = true;
	    
	    for(int i=1; i<=n; i++)
	    {
	        boolean cur[] = new boolean[sum+1];
	        cur[0] = true;
	        
	        for(int j=1; j<=sum; j++)
	        {
	            cur[j] = prev[j];
	            
	            if(arr[i-1]<=j)
	            {
	                cur[j] = cur[j] || prev[j-arr[i-1]];
	            }
	        }
	        
	        prev = cur;
	    }
	    
	    int min_diff = sum;
	    
	    for(int i=0; i<=sum; i++)
	    {
	        if(prev[i]){
	            min_diff = Math.min(min_diff, Math.abs(sum-2*i));
	        }
	    }
	    
	    return min_diff;
	} 
}
