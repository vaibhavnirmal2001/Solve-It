import java.util.*;

public class MinimumJumpsToEndOfArray {


        static int minJumps(int[] arr){
            int n= arr.length;
            if (n<0||n==0){
                return 0;
            }
            if (arr[0]==0 && n==1){
                return 0;
            }
            if (arr[0]==0 && n>0){
                return -1;
            }
            int maxrange=arr[0];
            int steps= arr[0];
            int jumps=1;
            for (int i=1;i<n;i++){
                if (i == arr.length - 1) {
                    return jumps;
                }
                if(maxrange<i+arr[i])
                    maxrange=i+arr[i];
                steps--;
                if (steps == 0) {
                    jumps++;
                    if(i>=maxrange)
                        return -1;
                    steps = maxrange - i;
                }
            }
            return jumps;
        }
    public static void main(String[] args) {
        System.out.println(minJumps(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
    }
}
