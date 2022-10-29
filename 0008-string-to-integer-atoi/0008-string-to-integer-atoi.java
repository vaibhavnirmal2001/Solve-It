class Solution {
    public int myAtoi(String s) {
             int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
        int i = 0, n = s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        boolean isPositive = true;
        if( i<n && ( s.charAt(i)=='+' || s.charAt(i)=='-' ) ){
            isPositive =  ( s.charAt(i)=='-' ? false : true);
            i++;
        }
        int ans = 0;
        while( i<n && Character.isDigit(s.charAt(i)) ){
            int val = s.charAt(i) - '0';
            if((MAX - val )/10 < ans){
                if(isPositive)  return MAX;
                else    return MIN;
            }
            ans = ans*10 + val;
            i++;
        }
        if(!isPositive) ans*=-1;
        return ans;
    }
}