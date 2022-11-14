import java.util.Arrays;

public class StringArrayEquals {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String s1= Arrays.toString(word1);
//        String s2= Arrays.toString(word1);
//
//        return s1.equals(s2);
        return Arrays.toString(word1).equals(Arrays.toString(word2));
    }

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab","c"},new String[]{"a","bc"}));

    }
}
