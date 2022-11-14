import java.util.*;
public class FreshGravityQue {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char[] charArray = str.toCharArray();
//        Arrays.sort(charArray);
//        System.out.println(new String(charArray));

        Scanner sc = new Scanner(System.in);

        String s= sc.next();
        String sortedString = "";

        char[] a = s.toCharArray();

        for(int i = 0; i < a.length; i++ ) {
            for(int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        sortedString = new String(a);
        System.out.println( sortedString);
    }
}










































