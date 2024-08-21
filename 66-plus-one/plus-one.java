class Solution {
    public static int[] plusOne(int[] a) {
        int rem=0;
        if (a[a.length-1]<9){
            a[a.length-1]=a[a.length-1]+1;
            return a;
        }
        for (int i = a.length-1; i >=0 ; i--) {
            if (i==a.length-1){
                int sum=a[i]+1;
                a[i]=sum%10;
                rem=1;
                continue;
            }
            if (a[i]<9){
                a[i]=a[i]+rem;
                return a;
            }else {
                int sum=a[i]+rem;
                a[i]=sum%10;
                rem=1;
            }
        }
        int[] res = new int[a.length + 1];
        res[0]=1;
        System.arraycopy(a, 0, res, 1, a.length);
        return res;
    }
}