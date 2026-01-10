class Solution {
    public static int maxProfit(int[] a) {
        if (a.length == 0) return 0;
        int min=a[0];
        int max=0;

        for(Integer x: a){
            if(x<min) min=x;
            else max=Math.max(max,x-min);
        }
        return max;
    }
}