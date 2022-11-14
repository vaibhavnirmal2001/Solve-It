public class BestTimeToBuySellStock {
    public static int maxProfit(int[] a) {
        if (a.length == 0) return 0 ;

        int max = 0, min = a[0] ;
        for (int x : a)
            if (x > min) max = Math.max(max, x - min);
            else min = x;
        return  max ;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
