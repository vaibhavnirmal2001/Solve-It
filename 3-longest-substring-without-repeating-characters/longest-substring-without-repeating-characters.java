class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> map = new LinkedHashMap<>();
         for(int i=0; i<s.length();i++){
             if(!map.containsKey(s.charAt(i))){
                 map.put(s.charAt(i),i);
             }
             else {
                 i = map.get(s.charAt(i));
                 map.clear();
             }
             maxLength = Math.max(maxLength, map.size());
         }
         return maxLength;
    }
}