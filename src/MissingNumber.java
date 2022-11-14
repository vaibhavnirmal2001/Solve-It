public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n=nums.length;

        int sum=n*(n+1)/2;
        int arraySum=0;

        for (int num : nums) {
            sum += num;
        }
        return sum-arraySum;


    }

    public static void main(String[] args) {

    }
}
