import java.util.*;

public class SmallestOnLeft {
    static List<Integer> leftSmaller(int n, int[] a){
        List<Integer> ans=new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for(int i =0; i<n ;i++) {
            while(!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                ans.add(i,-1);
            }
            else {
                ans.add(i,a[s.peek()]);
            }
            s.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {

        String reg=  "([^\\w])[0-9]{1,3}\\1";
        System.out.println("*&45*".matches(reg));
        System.out.println("-45454".matches(reg));
        System.out.println("W545W".matches(reg));
    }
}
