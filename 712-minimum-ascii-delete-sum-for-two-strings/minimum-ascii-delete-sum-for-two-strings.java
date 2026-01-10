class Solution {
    static int[][] dp;

    public static int solve(String s1, String s2, int i, int j) {
        // base case
        if (i >= s1.length() || j >= s2.length()) {
            return 0;
        }

        // memoized
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = s1.charAt(i) + solve(s1, s2, i + 1, j + 1);
        } else {
            ans = Math.max(
                    solve(s1, s2, i + 1, j),
                    solve(s1, s2, i, j + 1)
            );
        }

        dp[i][j] = ans;
        return ans;
    }

    public static int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length()][s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            Arrays.fill(dp[i], -1);
        }

        int commonAsciiSum = solve(s1, s2, 0, 0);

        int total = 0;
        for (char c : s1.toCharArray()) total += c;
        for (char c : s2.toCharArray()) total += c;

        return total - 2 * commonAsciiSum;
    }
}