class Solution {
    public boolean isPowerOfThree(int n) {
        for (int i = 0; i < n; i++) {
            double power= Math.pow(3,i);
            if (power==n) return true;
            if (power>n) return false;
        }
        return false;
    }
}