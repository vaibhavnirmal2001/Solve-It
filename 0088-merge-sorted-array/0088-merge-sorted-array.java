class Solution {
       public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (Integer x: nums1) al.add(x);
        for (Integer x: nums2) al.add(x);

        Collections.sort(al);
        for (int i = 0; i < nums2.length; i++) {
            al.remove(al.indexOf(0));
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=al.get(i);
        }
//        for (int i = 0; i < nums1.length; i++) {
//            System.out.print(nums1[i]+" ");
//        }
    }
}