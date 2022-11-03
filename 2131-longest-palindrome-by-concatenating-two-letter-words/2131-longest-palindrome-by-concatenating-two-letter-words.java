class Solution {
      public int longestPalindrome(String[] words) {
        Map<String, Integer> nonPaired = new HashMap<>();
        int pairs = 0, sym = 0;
        for (String w : words) {
            String reverse = new StringBuilder(w).reverse().toString();
            if (nonPaired.getOrDefault(reverse, 0) > 0) { // Find a counterpart for w among non-paired words.
                ++pairs;                                  // Increase the counter by 1.  
                nonPaired.merge(reverse, -1, Integer::sum); // Decrease reverse by 1 since it has been counted in pairs.
                sym -= w.charAt(0) == w.charAt(1) ? 1 : 0; // Decrease sym by 1 since it has been counted in pairs. 
            }else {
                nonPaired.merge(w, 1, Integer::sum); // Increase the occurrence of w. 
                sym += w.charAt(0) == w.charAt(1) ? 1 : 0; // Increase sym by 1. 
            }
        }
        return 4 * pairs + (sym > 0 ? 2 : 0);        
    }
}