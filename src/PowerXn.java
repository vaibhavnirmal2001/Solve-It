public class PowerXn {
    public static double myPow(double x, int n) {
        double pow=1;
        for (int i = 1; i <=n; i++) {
            pow*=x;
        }
        return pow;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000,10));
    }
}
