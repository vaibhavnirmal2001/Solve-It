class Solution {
    public int singleNumber(int[] nums) {
         ArrayList<Integer> al= new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!al.contains(nums[i])) al.add(nums[i]);
            else al.remove(al.remove(al.indexOf(nums[i])));
        }
        return al.get(0);
    }
}