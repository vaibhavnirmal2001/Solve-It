public class ModifyNumberQueries {
    public static boolean isPrime(int n){
        if (n==1) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0 && i!=n) return false;
        }
        return true;
    }
    public static int getSumOf(int n){
        int sum=0;
        if (n==1) return 1;
        for (int i = 1; i <=n ; i++) {
            if (isPrime(i) && n%i==0){
                sum+=i;
            }
        }
        return sum;

    }
    public static int sumOfAll(int l, int r) {
        int sum=0;
        for (int i = l; i <=r; i++) {
            sum+=getSumOf(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAll(1,2));
    }
}
