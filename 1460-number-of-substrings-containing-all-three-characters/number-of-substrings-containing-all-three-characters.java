class Solution {
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        int start = 0;
        
        // Iterate over each character using the 'end' pointer
        for (int end = 0; end < n; end++) {
            // Add current character to the frequency map
            freqMap.put(s.charAt(end), freqMap.getOrDefault(s.charAt(end), 0) + 1);
            
            // Check if the current window contains all 'a', 'b', and 'c'
            while (freqMap.getOrDefault('a', 0) > 0 && 
                   freqMap.getOrDefault('b', 0) > 0 && 
                   freqMap.getOrDefault('c', 0) > 0) {
                // If the window contains 'a', 'b', and 'c', it is a valid substring
                // All substrings starting from 'start' to 'end' are valid
                count += n - end; // All substrings starting at 'start' and ending at or after 'end'
                
                // Move the start pointer to shrink the window
                freqMap.put(s.charAt(start), freqMap.get(s.charAt(start)) - 1);
                start++;
            }
        }
        
        return count;
    }
}