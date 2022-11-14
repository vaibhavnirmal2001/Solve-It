public class RemoveConsecutiveChars {
    public static String removeConsecutiveCharacter(String s){
        String res="";
        if (s.length()==0|| s.length()==1) return s;
        res+=s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(i-1)) res+=s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutiveCharacter("aabaa"));
    }
}
