class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c] += 1;
        }
        int begin = 0;
        int len = Integer.MAX_VALUE;
        int count = t.length();
        for (int left=0, right=0; right<s.length(); right++) {
            char c = s.charAt(right);
            map[c]--;
            if(map[c]>=0) count--; 
            while (count == 0) {
                char lc = s.charAt(left);
                map[lc]++;
                if (map[lc]>0) {
                    if (right-left+1<len) {
                        begin = left;
                        len = right-left+1;
                    }
                    count++;
                }
                left++;
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(begin, begin+len);
    }
}