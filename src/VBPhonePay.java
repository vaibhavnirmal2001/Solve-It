import java.util.*;
public class VBPhonePay {
    static String stringRepeat( int n, int k,String s) {
        int []frequency_array = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequency_array[s.charAt(i) - 'a']++;
        }

        String ans = "";
        for (int i = 25; i >= 0;) {
            if (frequency_array[i] > k) {
                int temp = k;
                String st = String.valueOf((char)(i + 'a'));
                while (temp > 0) {
                    ans += st;
                    temp--;
                }
                frequency_array[i] -= k;
                int j = i - 1;

                while (frequency_array[j] <= 0 && j >= 0) {
                    j--;
                }

                if (frequency_array[j] > 0 && j >= 0) {
                    String str = String.valueOf((char)(j + 'a'));
                    ans += str;
                    frequency_array[j] -= 1;
                }
                else {
                    break;
                }
            }

            else if (frequency_array[i] > 0) {
                int temp = frequency_array[i];
                frequency_array[i] -= temp;
                String st = String.valueOf((char)(i + 'a'));

                while (temp > 0)
                {
                    ans += st;
                    temp--;
                }
            }

            else {
                i--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        String s= sc.next();
        String res = stringRepeat(n,k,s);
        System.out.println(res);
    }
}
