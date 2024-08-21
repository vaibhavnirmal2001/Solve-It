import java.math.BigInteger;

class Solution {
    public static String addBinary(String a, String b) {
        // int first= Integer.valueOf(a,2);
        // int second= Integer.valueOf(b,2);

        // return Integer.toBinaryString(first+second);
         BigInteger first = new BigInteger(a, 2);  // Convert binary string 'a' to a BigInteger
    BigInteger second = new BigInteger(b, 2); // Convert binary string 'b' to a BigInteger

    return first.add(second).toString(2);
    }
}