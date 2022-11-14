public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if (s.length()==1) return 1;
        StringBuilder res= new StringBuilder();

        for (int i=s.length()-1;i>=0;i--){
            if (Character.isAlphabetic(s.charAt(i))){
                while (Character.isAlphabetic(s.charAt(i))){
                    res.append(s.charAt(i));
                    i--;
                    if (i<0) break;
                }
                return res.length();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }
}
