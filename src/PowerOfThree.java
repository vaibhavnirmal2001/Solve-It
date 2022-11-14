public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {

        for (int i = 0; i < n; i++) {
            double power= Math.pow(3,i);
            if (power==n) return true;
            if (power>n) return false;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
