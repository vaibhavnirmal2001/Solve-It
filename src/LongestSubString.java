import java.util.*;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int longestLength=0;

        HashMap<Character,Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),i);
            }
            else {
                i=hm.get(s.charAt(i));
                hm.clear();
            }
            if (hm.size()>longestLength) longestLength=hm.size();
        }
        return longestLength;
    }

}
