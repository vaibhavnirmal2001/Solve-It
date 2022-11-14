import java.util.*;
public class MissingRanges {
//    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
//        List<String > al= new ArrayList<>();
//

//        for (int i = lower,j=0; i <=upper&&j<nums.length; i++,j++) {
//            if (nums[j]!=i) {
//                String temp="";
//                temp+=String.valueOf(j);
//                temp+="->";
//                temp+=String.valueOf(nums[i]-1);
//                al.add(temp);
//                i=nums[i];
//
//            }
//        }
//        return al;
//    }

        public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
            List<String> res = new LinkedList<String>();

            boolean overflow = false;
            for (int i = 0; i < nums.length; i ++) {
                if (lower < nums[i]) {
                    res.add(getRange(lower, nums[i] - 1));
                }
                lower = nums[i] + 1;
                if (lower == Integer.MIN_VALUE) {
                    overflow = true;
                    break;
                }
            }
            if (lower <= upper && !overflow) {
                res.add(getRange(lower, upper));
            }
            return res;
        }
        public static String getRange(int a, int b) {
            if (a == b) {
                return a+"";
            }
            else {
                return a + "->" + b;
            }
        }


    public static void main(String[] args) {
        System.out.println(findMissingRanges(new int[]{0, 1, 3, 50, 75},0,99));
    }
}
