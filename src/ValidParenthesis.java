import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String s) {
        //char[] c= s.toCharArray();
        Stack<Character> st= new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='(' || s.charAt(i)=='['|| s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else if (!st.isEmpty()){
                char poppins='P';
                if (s.charAt(i)==')')poppins='(';
                if (s.charAt(i)==']')poppins='[';
                if (s.charAt(i)=='}')poppins='{';
                if (st.pop()!=poppins) return false;
            }else return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
}
