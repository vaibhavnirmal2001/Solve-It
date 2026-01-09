class Solution {
    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        String res = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (res.length() > s.substring(i, j).length()) {
                    continue;
                } else {
                    if (isPalindrome(s.substring(i, j))) {
                        res = s.substring(i, j);
                    }
                }
            }
        }
        return res;
    }
}