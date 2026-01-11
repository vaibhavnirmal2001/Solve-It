class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
    int ans = 0, m = matrix.length, n = matrix[0].length;
    int[] height = new int[n]; // height

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == '0') {
                height[j] = 0;
                continue;
            }
            height[j]++;
            for (int cur = j - 1, pre = height[j]; cur >= 0; cur--) {
                if (height[cur] == 0) break;
                pre = Math.min(pre, height[cur]);
                ans = Math.max(ans, (j - cur + 1) * pre);
            }
            ans = Math.max(ans, height[j]);
        }
    }
    return ans;
    }
}