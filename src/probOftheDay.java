import java.util.Arrays;

public class probOftheDay {
    public static void main(String[] args) {
        int[][] m= {{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(m,8));
    }
    public static int kthSmallest(int[][] m, int K) {
        int[] a= new int[m.length * m.length];
        int k=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                a[k]=m[i][j];
                k++;
            }
        }

        Arrays.sort(a);

        return a[K-1];
    }
}
