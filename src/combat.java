import java.util.*;

public class combat {
//    public int[][] flipAndInvertImage(int[][] m) {
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0,k=m[0].length-1; j < m[0].length&& j<k; j++,k--) {
//                int temp = m[i][j];
//                m[i][j]=m[i][k];
//                m[i][k]=temp;
//            }
//        }
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[0].length; j++) {
//                if (m[i][j]==1){
//                    m[i][j]=0;
//                }else {
//                    m[i][j]=1;
//                }
//            }
//        }
//        return m;
//
//    }



//    public static String rev(String s){
//        char[] a= s.toCharArray();
//        for (int i = 0,j=a.length-1; i < a.length && i<j; i++,j--) {
//            char temp=a[i];
//            a[i]=a[j];
//            a[j]=temp;
//        }
////        System.out.println("ans:::"+ Arrays.toString(a));
//        String ans = "";
//        for (char c : a) {
//            ans += c;
//        }
//        return ans;
//    }
//    public static String reverseWords(String s) {
//        String[] a= s.split(" ");
//
//        for (int i = 0; i < a.length; i++) {
//            a[i]= rev(a[i]);
//        }
//        String ans="";
//
//        for (int i = 0; i < a.length; i++) {
//            ans+=a[i];
//            if (i<a.length-1) ans+=" ";
//        }
//
//        return ans;
//
//    }




//    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        PriorityQueue<int[]> que = new PriorityQueue<>((a,b)->a[2]-b[2]);
//        List<List<Integer>> res = new ArrayList<>();
//        if(nums1.length==0 || nums2.length==0 || k==0) return res;
//
//        for(int i=0; i<nums1.length && i<k; i++) {
//            que.offer(new int[]{i, 0, nums1[i] + nums2[0]});
//        }
//        while(k-- > 0 && !que.isEmpty()){
//            int[] curr = que.poll();
//            int i = curr[0], j = curr[1];
//            res.add(Arrays.asList(nums1[i], nums2[j]));
//            if(j+1 == nums2.length) continue;
//            que.offer(new int[]{i, j+1, nums1[i] + nums2[j+1]});
//        }
//        return res;
//    }



//    public static int minimumOperations(int[] nums) {
//       int count=0;
//        for (int i = 0; i < nums.length; i++) {
//            Arrays.sort(nums);
//            if (nums[i]>0) {
//                int x=nums[i];
//                count++;
//                for (int j = i; j < nums.length; j++) {
//                    if (nums[j]!=0) nums[j] -=x;
//                }
//            }
//
//        }
//        return count;
//
//    }



    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length && i!=j; j++) {
                if (nums[i]==nums[j]){
                    if (Math.abs(i - j) <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //System.out.println(reverseWords("Let's take LeetCode contest"));
        //System.out.println(minimumOperations(new int[]{1,5,0,3,5}));


    }
}
