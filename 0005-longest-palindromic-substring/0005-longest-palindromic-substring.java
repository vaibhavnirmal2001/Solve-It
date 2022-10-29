class Solution {
        public String longestPalindrome(String s) {
        if(s=="" ||s.length()==0) return "";
        int start=0;
        int end=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            int len1=expandAroundCenter(s,i,i);
            int len2=expandAroundCenter(s,i,i+1);
            len=Math.max(len1,len2);
            if(len>end-start && len==len1){
                start=i-(len-1)/2;
                end=i+(len-1)/2;
            }
            if(len>end-start && len==len2){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    private int expandAroundCenter(String s,int start,int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }
    
}