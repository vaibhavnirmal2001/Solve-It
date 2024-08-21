class Solution {
    public static int lengthOfLastWord(String s) {
        boolean isWordStarted=false;
        int chars=0;

        for (int i = s.length()-1; i >=0 ; i--) {
            if (isWordStarted && s.charAt(i)==' '){
                return chars;
            }
            if (!(s.charAt(i)==' ')){
                isWordStarted=true;
                chars++;
            }
        }
        return chars;
    }
}