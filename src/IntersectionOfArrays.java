import java.util.*;

public class IntersectionOfArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (Integer x: nums1){
            int freq= hm.getOrDefault(x,0);
            hm.put(x,freq+1);
        }

        ArrayList<Integer> al = new ArrayList<>();
        for (Integer i: nums2){
            if (hm.get(i)!=null && hm.get(i)>0){
                al.add(i);
                hm.put(i,hm.get(i)-1);
            }
        }

        int[] ret = new int[al.size()];
        for(int i = 0; i < al.size();i++){
            ret[i] = al.get(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5},new int[]{9,4,9,8,4})));
    }
}
