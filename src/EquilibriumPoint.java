public class EquilibriumPoint {
    public static int equilibriumPoint(long a[], int n) {
        if (a.length==1) return 1;
        int sum=0;
        for (long x: a) sum+=x;
        int temp=0;
        for (int i = 1; i < a.length; i++) {
            a[i]=a[i]+a[i-1];

            if (a[i-1]==sum-a[i]) return i+1;
        }
        return -1;


    }
    public static void main(String[] args) {

    }
}
