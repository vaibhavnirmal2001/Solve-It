import java.util.*;

public class ClassTwo {
    public static int dominantIndex(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[nums.length-1]<(2*nums[i]) && i!=nums.length-1&& i!=0){
                return nums.length;
            }
        }
        return 1;
    }
    public static boolean checkValid(int[][] m) {


        for (int i = 0; i < m.length; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < m[0].length; j++) {
                al.add(m[i][j]);
            }
            for (int j = 1; j <= m.length; j++) {
                if (!al.contains(j)) return false;
            }
        }

        for (int i = 0; i < m.length; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < m.length; j++) {
                al.add(m[j][i]);
            }
            for (int j = 1; j <= m.length; j++) {
                if (!al.contains(j)) return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(checkValid(new int[][]{{1,2,3},{3,1,2},{2,3,1}}));



//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int k= sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i]=sc.nextInt();
//        }
//        int sum=0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i]>0&& a[i]!=k)sum+=a[i];
//        }
//        System.out.println(sum);
    }
}
