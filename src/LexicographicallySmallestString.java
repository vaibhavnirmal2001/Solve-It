import java.util.*;

public class LexicographicallySmallestString {
    public static String swap(String s, int i,int j){
        StringBuilder b= new StringBuilder(s);
        char temp=s.charAt(i);
        b.setCharAt(i,s.charAt(j));
        b.setCharAt(j,temp);
        return b.toString();
    }
    public static String convertString(String s){
        ArrayList<Character> vo = new ArrayList<>();
        vo.add('a');
        vo.add('e');
        vo.add('i');
        vo.add('o');
        vo.add('u');
        int t=3;

        ArrayList<Character> al = new ArrayList<>();
        for(char chr = 'a'; chr <= 'z' ; chr++)
                if (!vo.contains(chr))al.add(chr);

        while (t-->0){
                    for (int i = 0; i < s.length() - 1; i++) {
                        if (vo.contains(s.charAt(i)) && al.contains(s.charAt(i + 1))) {
                            s = swap(s, i, i + 1);
                        } else if (al.contains(s.charAt(i)) && vo.contains(s.charAt(i + 1))) {
                            s = swap(s, i, i + 1);
                        }
                    }
            }
        for (int i = 0; i < s.length() - 1; i++) {
            if (vo.contains(s.charAt(i)) && al.contains(s.charAt(i + 1))) {
                if (s.charAt(i)>s.charAt(i+1)) s = swap(s, i, i + 1);
            } else if (al.contains(s.charAt(i)) && vo.contains(s.charAt(i + 1))) {
                if (s.charAt(i)>s.charAt(i+1)) s = swap(s, i, i + 1);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("final ans: "+convertString("auehib")); //ahbuei
        
    }
}
