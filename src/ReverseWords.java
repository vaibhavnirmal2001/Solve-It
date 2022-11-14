import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {
    public static String reverseWords(String s) {

        s=s.trim().replaceAll(" +", " ");
        ArrayList<String> al = new ArrayList<>();

        StringBuilder temp= new StringBuilder();

        for (Character c: s.toCharArray()){
            if (c==' ') {
                al.add(temp.toString());
                temp = new StringBuilder();
            }
            else {
                temp.append(c);
            }
        }
        al.add(String.valueOf(temp));
        Collections.reverse(al);
//        System.out.println(al);
        StringBuilder ans= new StringBuilder();
        for (int i = 0; i < al.size(); i++) {
            if (i==al.size()-1){
                ans.append(al.get(i));
                break;
            }
            if (i<al.size()-1){
                ans.append(al.get(i)).append(" ");
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example     "));
    }

}
