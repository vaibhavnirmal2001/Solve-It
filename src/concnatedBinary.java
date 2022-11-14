import java.util.*;
public class concnatedBinary {

    public int minLength(String s, int n) {
        // code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }else{

                if ((st.peek() == '1' && ch == '2' || st.peek() == '2' && ch == '1') || (st.peek() == '3' && ch == '4' || st.peek() == '4' && ch == '3') || (st.peek() == '5' && ch == '6' || st.peek() == '6' && ch == '5') || (st.peek() == '7' && ch == '8' || st.peek() == '8' && ch == '7') || st.peek() == '9' && ch == '0' || st.peek() == '0' && ch == '9') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }
        return st.size();
    }

    public static int concatenatedBinary(int n) {
        final long modulo = (long) (1e9 + 7);
        long result = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                temp /= 2;
                result *= 2;
            }

            result = (result + i) % modulo;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(concatenatedBinary(12));

    }
}
