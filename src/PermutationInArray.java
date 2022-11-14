import java.util.Arrays;

public class PermutationInArray {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0,j=b.length-1; i < j; i++,j--) {
            long temp=b[i];
            b[i]=b[j];
            b[j]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            if (!(a[i]+b[i]>=k)) return false;
        }
        return true;
    }
}
