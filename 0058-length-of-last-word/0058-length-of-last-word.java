class Solution {
    public static int lengthOfLastWord(String s) {
        if (s.length()==1) return 1;
        String res="";

        for (int i=s.length()-1;i>=0;i--){
            if (Character.isAlphabetic(s.charAt(i))){
                while (Character.isAlphabetic(s.charAt(i)) && i >=0){
                    res+=s.charAt(i);
                    i--;
                    if (i<0) break;
                }
                return res.length();
            }
        }
        return 0;
    }
}