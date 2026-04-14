class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int curr =0; curr<nums.length; curr++){
            if(nums[curr]!=0){
                nums[index++] = nums[curr];
            }
        }

        while(index <nums.length){
            nums[index++]=0;
        }
    }
}