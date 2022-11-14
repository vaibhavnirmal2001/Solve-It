import java.util.Arrays;

public class FirstAndLastPositionOfElementInArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        for (int i = 0,j=nums.length-1; i <=j; ) {
            if (nums[i]==target) {
                ans[0] = i;
            }
            if (nums[j]==target) {
                ans[1] = j;
            }
            if (ans[0]!=-1 && ans[1]!=-1) return ans;
            else if (ans[0]==-1) i++;
            else if (ans[1]==-1) j--;

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }
}
