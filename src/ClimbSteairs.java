public class ClimbSteairs {
    public static int climbStairs(int n) {

        int result=0;

        if (n==0 || n==1) return n;
        int step1=1,step2=1;

        for (int i = 2; i <=n; i++) {
            result=step1+step2;
            step1=step2;
            step2=result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
