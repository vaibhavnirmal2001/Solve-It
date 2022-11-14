public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) sb.append(s.charAt(i));
            if (Character.isDigit(s.charAt(i))) sb.append(s.charAt(i));
        }
        return isPalindromeCheck(sb.toString().toLowerCase());
    }
    public static boolean isPalindromeCheck(String s){
        for (int i = 0,j=s.length()-1; i < j; i++,j--) if (s.charAt(i)!=s.charAt(j)) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));

    }
}
