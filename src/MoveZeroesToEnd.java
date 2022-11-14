import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        if (nums.length==1) return;
        int count=0;
        for (int i = 0,j=0; i < nums.length; i++) {
            if (nums[i]==0) count++;

            if (nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for (int i = nums.length-count; i < nums.length; i++) {
            nums[i]=0;
        }

    }

    public static void main(String[] args) {
        int[] nums=new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
