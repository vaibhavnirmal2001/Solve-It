public class ContinuousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        int sum=0;
        for(Integer x: nums)sum+=x;
        if (sum%k==0) return true;
        for (int i = 0; i < nums.length; i++) {
            if(sum<k) return false;
            sum=sum-nums[i];
            if (sum%k==0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[]{23,2,6,4,7},13));
    }
}
