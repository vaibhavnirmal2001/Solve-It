//import java.util.*;
//
//public class Codechef {
//    public static String calculateIt(int[] a){
//        int maxFreq = 0;
//        int maxTemp=0;
//        for (int i = 0; i < a.length; i++) {
//            int count=0;
//            for (int j = 0; j < a.length && j!=i; j++) {
//                if (a[i]==a[j]){
//                    count++;
//                }
//            }
//
//            if (maxFreq==count) maxFreq=0;
//            else  maxFreq= Math.max(count,maxFreq);
//        }
//        return maxFreq!=0?"Yes":"No";
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//        while (t-->0){
//            int n= sc.nextInt();
//            int[] a = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i]=sc.nextInt();
//            }
//            System.out.println(calculateIt(a));
//        }
//    }
//}












import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b = sc.nextInt();
            int s=0,l=0;
            if(a<b){
                s=a; l=b;
            }else if(a>b){
                s=b; l=a;
            }else{
                s=l=a;
            }
            while(s<=l){
                if(s==l) {
                    System.out.println("YES");
                    break;
                }
                s*=2;

            }
            if(s>l)
            System.out.println("No");
        }
    }
}
