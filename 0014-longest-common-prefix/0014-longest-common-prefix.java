class Solution {
        public static String longestCommonPrefix(String[] strs){
            Arrays.sort(strs);
        if (strs.length<2) return strs[0];
        String res=strs[0];
        for (int i = 1; i <strs.length ; i++) {
            for (int j = 0; j < strs[i].length()&&j<res.length(); j++) {
                if (strs[i].charAt(j)==res.charAt(j)) continue;
                else {
                    res=res.substring(0,j);
                    break;
                }
            }
        }
        return res;
    }
}