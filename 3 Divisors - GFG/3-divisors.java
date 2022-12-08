//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int q = sc.nextInt();
            ArrayList<Long> query = new ArrayList<>();
            for(int i=0;i<q;i++){
                query.add(sc.nextLong());
            }
            Solution ob = new Solution();
                
            ArrayList<Integer> ans = ob.threeDivisors(query,q);
            for(int cnt : ans) {
                System.out.println(cnt);
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        int maxi=0;;
        for(long a:query) {
            maxi=Math.max(maxi,(int)Math.sqrt(a));
        }
        boolean primes[]=new boolean[maxi+1];

        Arrays.fill(primes,true);

        primes[0]=false; primes[1]=false;
        for(int i=2;i<primes.length;i++) {
            if(primes[i]) {
                for(int j=i*2;j<primes.length;j=j+i) {
                    primes[j]=false;
                }
            }
        }
        int sum[]=new int[maxi+1];
        sum[0]=0;
        sum[1]=0;
        for(int i=2;i<=maxi;i++) {
            sum[i]=sum[i-1];
            if(primes[i])
                sum[i]++;
        }

        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<query.size();i++)        {
            int sq=(int)Math.sqrt(query.get(i));
            al.add(sum[sq]);
        }
        return al;
    }
}