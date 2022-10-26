class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int len  = nums.length;
        if(len<2)
         return false;
        Set<Integer>set = new HashSet<>();
        int prevRem = nums[0]%k;
        int sum = nums[0];
        for(int i=1;i<len;i++){
            sum+=nums[i];
            int rem = sum%k;
            if(set.contains(rem)||rem==0)
             return true;
            set.add(prevRem);
            prevRem = rem; 

        }
        return false;
        
    }
}