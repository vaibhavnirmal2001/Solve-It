class Solution {
    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> wordCount = new HashMap<>();

        Arrays.stream(s1.split(" ")).forEach(word -> wordCount.put(word, wordCount.getOrDefault(word, 0) + 1));
        Arrays.stream(s2.split(" ")).forEach(word -> wordCount.put(word, wordCount.getOrDefault(word, 0) + 1));

        List<String> uncommonWords = wordCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        return uncommonWords.toArray(new String[0]);
    }
}