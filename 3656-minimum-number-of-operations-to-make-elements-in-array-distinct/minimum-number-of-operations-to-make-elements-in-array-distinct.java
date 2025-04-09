class Solution {
    public static boolean isDistinct(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.size() == list.size();
    }

    public static int minimumOperations(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        int operations = 0;
        while (!isDistinct(list)) {
            operations++;
            // remove first 3 or all if less than 3
            int toRemove = Math.min(3, list.size());
            for (int i = 0; i < toRemove; i++) {
                list.remove(0);
            }
        }

        return operations;
    }
}