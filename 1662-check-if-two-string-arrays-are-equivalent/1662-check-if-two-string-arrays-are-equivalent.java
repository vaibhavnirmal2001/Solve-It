class Solution {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();
        for (String value : word1) {
            s1.append(value);
        }
        for (String s : word2) {
            s2.append(s);
        }
        return s1.toString().equals(s2.toString());

    }
}