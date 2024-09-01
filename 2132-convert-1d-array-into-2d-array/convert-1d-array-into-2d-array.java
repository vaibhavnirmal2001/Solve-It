class Solution {
   public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res= new int[m][n];
        if (original.length!=(m*n)) return new int[0][0];
        int k=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j]=original[k];
                k++;
                if (k==original.length) break;
            }
            if (k==original.length) break;
        }
        return res;
    }
}