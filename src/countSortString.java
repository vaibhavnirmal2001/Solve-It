import java.util.*;

public class countSortString {
    public static String countSort(String arr) {
        char[] ans= arr.toCharArray();
        Arrays.sort(ans);
        return new String(ans);
    }

    public static void main(String[] args) {
        System.out.println(countSort("geeksforgeeks"));
    }


}
