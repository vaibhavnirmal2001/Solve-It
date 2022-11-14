import java.util.*;

public class MaxOfRange {
    public static int getMax(int[] a,int k){
        int max=a[0];
        for (int x : a) {
            if (x > max) max = x;
        }
        return max;
    }

    static ArrayList<Integer> max_of_subarrays(int[] arr, int n, int k) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=getMax(Arrays.copyOfRange(arr,i,i+k),k);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0;i<arr.length-k+1;i++) {
            al.add(arr[i]);
        }
        return al;
    }

    public static void main(String[] args) {
        System.out.println(max_of_subarrays(new int[]{8, 5, 10, 7, 9, 4, 15, 12, 90, 13},10,4));
    }
}
