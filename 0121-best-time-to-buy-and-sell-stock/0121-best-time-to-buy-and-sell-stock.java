class Solution {
    public static int maxProfit(int[] a) {
        if (a.length == 0) return 0 ;

        int max = 0, min = a[0] ;
        for (int x : a)
            if (x > min) max = Math.max(max, x - min);
            else min = x;
        return  max ;
    }
}