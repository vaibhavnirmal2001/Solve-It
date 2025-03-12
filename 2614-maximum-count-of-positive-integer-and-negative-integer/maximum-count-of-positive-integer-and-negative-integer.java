class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for (Integer x: nums){
            if (x<0)neg++;
            else if (x>0)pos++;
            
        }
        return Math.max(pos,neg);
    }
}