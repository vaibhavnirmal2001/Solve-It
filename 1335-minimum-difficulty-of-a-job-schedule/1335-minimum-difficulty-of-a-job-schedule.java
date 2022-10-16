class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if(n < d) {
            return -1;
        }
        int[][] memo = new int[n][d + 1];
        for(int[] m:memo) {
            Arrays.fill(m, -1);
        }
        return mindiff(jobDifficulty,d,0,memo);
    }
    public int mindiff(int[] nums, int d,int value,int[][] memo) {
        if(memo[value][d] != -1) {
            return memo[value][d];
        }
        if(d == 1) {
            int max = 0;
            for(int i = value;i < nums.length;i++) {
                max = Math.max(max, nums[i]);
            }
            return max;
        }
        int min = Integer.MAX_VALUE;
        int max =0;
        for(int i = value;i < nums.length - d  + 1;i++) {
            max = Math.max(max,nums[i]);
            min = Math.min(min,max + mindiff(nums,d - 1,i + 1, memo));
        }
        memo[value][d] = min;
        return min;
    }
}
