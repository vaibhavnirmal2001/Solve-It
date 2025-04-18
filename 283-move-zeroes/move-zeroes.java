class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;

        int count = 0;

        for (int i = 0,j=0; i < nums.length; i++) {
            if(nums[i]==0) count++;

            if(nums[i]!=0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=nums.length-count; i<nums.length; i++) {
            nums[i]=0;
        }
    }
}