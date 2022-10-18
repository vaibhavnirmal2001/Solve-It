class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = countAndSay(n-1), curr = "";
        int count = 1;
        for (int i = 1; i < prev.length(); i++) {
            while (i < prev.length() && prev.charAt(i-1) == prev.charAt(i)) {
                count++;
                i++;
            }
            curr += count + "" + prev.charAt(i-1);
            count = 1;
        }
        if (n % 2 == 0) curr += count + "" + prev.charAt(prev.length()-1);
        return curr;
    }
}
