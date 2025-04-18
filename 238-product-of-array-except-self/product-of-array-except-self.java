class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int product=1;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            product*=nums[i];
        }
        for (int i = 0; i < res.length; i++) {
            if (nums[i]==0){
                res[i] = getProdForZero(nums,i);
            }else{
                res[i] = product/nums[i];
            }
        }
        return res;

    }
    public static int getProdForZero(int[] nums, int k){
        int prod =1;
        for (int i = 0; i < nums.length; i++) {
            if (i!=k) prod*=nums[i];
        }
        return prod;
    }
}