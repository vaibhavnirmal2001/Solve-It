class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==0) return nums[0];
            ArrayList<Integer> al = new ArrayList<>();
            for(Integer x: nums){
                if(al.contains(x)){
                    al.remove(al.indexOf(x));
                }else{
                    al.add(x);
                }
            }
            return al.get(0);
    }
}