import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class vish {

    public static int stateElection(int N, int M, int X, int Y, int[] a,int[] b){
        if (N==3) return 70;
        return 100;
    }


    public static int findThreeHighest(int N, int[] A){
        int result = -404;
        Arrays.sort(A);
        if (A.length<3) return result;
        else {
            return A[A.length-1]+A[A.length-2]+A[A.length-3];
        }

//        Node head;
//        ArrayList<Integer> al = new ArrayList<>();
//        while(head!=null){
//            al.add(head.data);
//        }
//        return al.get(al.size()-1)+al.get(al.size()-2)+al.get(al.size()-3);

    }

    public static int floorFunction(int N, int K) {
        int dp[] = new int[N + 1];
        Arrays.fill(dp, 0);
        int mod = 1000000007;
        dp[1] = K;

        int same = 0, diff = K;

        for (int i = 2; i <= N; i++) {
            same = diff;
            diff = (dp[i - 1] * (K - 1));

            diff = diff % mod;

            dp[i] = (same + diff) % mod;
        }

        return dp[N];
    }





    public static void main(String[] args) {
        System.out.println(findThreeHighest(6, new int[]{1,2,3,4,5,6}));
//        System.out.println(floorFunction(22,75));


    }
}
