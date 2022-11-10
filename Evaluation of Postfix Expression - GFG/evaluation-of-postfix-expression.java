//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
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
}