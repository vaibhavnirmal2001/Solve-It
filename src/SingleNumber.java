import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        ArrayList<Integer> al= new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!al.contains(nums[i])) al.add(nums[i]);
            else al.remove(al.remove(al.indexOf(nums[i])));
        }
        return al.get(0);
    }

    public static void main(String[] args) {

    }
}
