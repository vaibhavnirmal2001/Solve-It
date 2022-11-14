import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{1, 0, 1, 0, 2, 0})));
        System.out.println();
    }

    public static int[] moveZeroes(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)

            {
                nums[count++]=nums[i];
            }
        }
        for(int i=count;i<nums.length;i++)
        {
            nums[i]=0;
        }
//        for(Integer x:nums)
//        {
//            System.out.print(x+"");
//        }
        return nums;

    }
}
