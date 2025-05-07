// class Solution {
//     public int maxSubArray(int[] a) {
//         int sum=a[0];
//      for (int i = 0; i < a.length; i++) {
//             for (int j = i; j < a.length; j++) {
//                 int temp=getSumOfRange(Arrays.copyOfRange(a,i,j+1));
//                 if (temp>sum) sum=temp;
//             }
//         }
//         return sum;   
//     }
//     public static int getSumOfRange(int a[]){
//         int sum=0;
//         for (Integer x:a){
//             sum+=x;
//         }
//         return sum;
//     }
// }
class Solution {
    public int maxSubArray(int[] nums) {
        // if(nums.length == 1){
        //     return nums[0];
        // }
        
        // int sum=Integer.MIN_VALUE;
        // int currMax=0;
        // for(int x: nums){
        //     int currSum= x+ currMax;
            
        //     currMax = Math.max(x, currSum);
            
        //     sum= Math.max(sum, currMax);
        // }
        // return sum;
        if(nums.length ==1) return nums[0];

        int sum = Integer.MIN_VALUE;
        int currMax=0;
        for(int x: nums){
            currMax = x+ currMax;
            currMax = Math.max(x, currMax);
            sum = Math.max(sum, currMax);
        }
        return sum;
    }
}