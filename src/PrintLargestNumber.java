import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintLargestNumber {

    static String printLargest(String[] a) {
        Arrays.sort(a);
        String res= "";
        for (int i = a.length-1; i >=0; i--) {
            res+=a[i];
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(printLargest(new String[] {"3", "30", "34", "5", "9"}));
    }
}
