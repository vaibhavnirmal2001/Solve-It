import java.util.*;

public class ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        ArrayList<Character> al = new ArrayList<>();
        ArrayList<Character> vowel = new ArrayList<>();
        vowel.add('a');
        vowel.add('e');     vowel.add('i');     vowel.add('o');
        vowel.add('u');     vowel.add('A');     vowel.add('E');
        vowel.add('I');     vowel.add('O');     vowel.add('U');

        for (Character c: s.toCharArray()){
            if (vowel.contains(c)){
                al.add(c);
            }
        }
        Collections.reverse(al);
        int i=0;
        StringBuilder ans= new StringBuilder();
        for (Character c: s.toCharArray()){
            if (vowel.contains(c)){
               ans.append(al.get(i));
               i++;
               continue;
            }else {
                ans.append(c);
            }

        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("Aa"));
    }
}
