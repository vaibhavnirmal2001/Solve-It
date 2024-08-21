class Solution {
     public boolean isPalindrome(int x) {
        String n = String.valueOf(x);
        for (int i = 0,j=n.length()-1; i < j; i++,j--) {
            if (n.charAt(i)!=n.charAt(j)) return false;
        }
        return true;
    }
}