import java.util.*;

public class RemoveDuplicatesSorted {

    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> al= new ArrayList<>();
        for (Integer x: nums) {
            if (!al.contains(x)){
                al.add(x);
            }
        }

        for (int i = 0; i < al.size(); i++) {
            nums[i]=al.get(i);
        }
        for (int i = al.size(); i < nums.length; i++) {
            nums[i]='_';
        }
        return al.size();
    }
    public static void main(String[] args) {

    }
}
