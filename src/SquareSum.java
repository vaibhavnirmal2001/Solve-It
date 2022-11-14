import java.util.Map;

public class SquareSum {
    public static boolean judgeSquareSum(int c) {

        long left=0, right=(long)Math.sqrt(c);
        while (left<=right){
            long sum= left*left+right*right;
            if (sum > c){
                right--;
            }else if (sum<c){
                left++;
            }else {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(1000000000));
    }
}
