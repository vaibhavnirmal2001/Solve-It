public class MaximumSubArraySum {
    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,sum=0;

        for (int num : nums) {
            sum += num;
            max=Math.max(sum,max);
            if (sum < 0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
