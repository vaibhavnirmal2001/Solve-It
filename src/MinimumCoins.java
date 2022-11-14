import java.util.*;
public class MinimumCoins {

    static List<Integer> minPartition(int n){
        List<Integer> al = new ArrayList<>();
        int[] a = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        for (int i = a.length-1; i >=0 ; i--) {
            while (n>=a[i]){
                n-=a[i];
                al.add(a[i]);
            }
            if (n==0) break;
        }
        return al;

    }

    public static void main(String[] args) {
        System.out.println(minPartition(1000));
    }
}
