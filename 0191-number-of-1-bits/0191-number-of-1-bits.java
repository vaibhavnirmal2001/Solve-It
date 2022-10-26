public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
//         String s = Integer.toString(n);
        
//         int sum = 0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='1') sum+=1;
//         }
//         return sum;
        
        int ones = 0;
    	while(n!=0) {
    		ones = ones + (n & 1);
    		n = n>>>1;
    	}
    	return ones;
        
    }
}