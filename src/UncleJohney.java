import java.util.*;
public class UncleJohney {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=  sc.nextInt();
            int[] a  = new int[n];
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            int k= sc.nextInt();

            k=a[k-1];
            Arrays.sort(a);

            for(int i=0;i<a.length;i++){
                if(a[i]==k) {
                    System.out.println(i+1);
                    break;
                }
            }
        }

    }
}
