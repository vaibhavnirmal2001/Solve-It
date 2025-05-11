class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                oddCount++;
            } else {
                oddCount = 0;
            }

            if (oddCount == 3) {
                return true;
            }
        }

        return false;
    }
}