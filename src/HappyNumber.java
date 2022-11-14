public class HappyNumber {
    public static boolean isHappy(int n) {
        int slow = n,fast = n;

        do{
            slow = compute(slow);
            fast = compute(compute(fast));

            if(slow == 1)return true;
        }while(slow != fast);

        return false;

    }
    public static int compute(int n){
        int s = 0;
        while(n != 0){
            s += (n%10)*(n%10);
            n = n/10;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

}
