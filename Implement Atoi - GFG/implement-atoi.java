//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	    for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)=='-' && s.charAt(i+1)!='-') continue;
            if (!Character.isDigit(s.charAt(i)))return -1;
        }
        return Integer.parseInt(s);
    }
}
