import java.util.Stack;

public class PostFixExpression {
    public static int evaluatePostFix(String s) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >='0' && s.charAt(i)<='9'){
                st.push(Integer.parseInt(String.valueOf(s.charAt(i))));
            } else if (s.charAt(i)=='*') {
                st.push(st.pop()*st.pop());
            }else if (s.charAt(i)=='+'){
                st.push(st.pop()+st.pop());
            } else if (s.charAt(i)=='/') {
                int c1=st.pop();
                int c2=st.pop();
                st.push(c2/c1);
            }else if (s.charAt(i)=='-'){
                int c1=st.pop();
                int c2=st.pop();
                st.push(c2-c1);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostFix("231*+9-"));
    }
}
