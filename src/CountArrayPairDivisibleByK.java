public class CountArrayPairDivisibleByK {
    public static long countPairs(int[] nums, int k) {
        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length && i!=j; j++) {
                if ((nums[i]*nums[j])%k==0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{1,2,3,4,5},2));
    }
}
