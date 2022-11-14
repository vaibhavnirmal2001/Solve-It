public class HammingWait {
    public static int hammingWeight(int n) {
//        int count=0;
//        if (n==0) return count;
//
//        while (n!=0){
//            count+=(n&1);
//            n=n>>>1;
//        }
//        return count;
        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1);
            n = n>>1;
        }
        return ones;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(1010101011));
    }
}
