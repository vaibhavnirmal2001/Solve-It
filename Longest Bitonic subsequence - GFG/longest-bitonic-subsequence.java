//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestBitonicSequence(int[] nums){
        int n = nums.length;
        int mem1[] = new int[n];
        int mem2[] = new int[n];
        
        
        for(int i=0; i<n; i++){
            mem1[i] = 1;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i] && mem1[j]+1>mem1[i]){
                    mem1[i] = mem1[j]+1;
                }
            }
        }
        
        for(int i=n-1; i>=0; i--){
            mem2[i] = 1;
            for(int j=i+1; j<n; j++){
                if(nums[j]<nums[i] && mem2[j]+1>mem2[i]){
                    mem2[i] = mem2[j] + 1;
                }
            }
        }
        
        int ans = 0;
        
        for(int i=0; i<n; i++){
            ans = Math.max(ans, mem1[i] + mem2[i] - 1);
        }
        
        return ans;
    }
}