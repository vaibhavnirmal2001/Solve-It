import java.util.ArrayList;
import java.util.Collections;

public class NewIshika {

    public static int lastKdigits(int A, int B, int K){
        int result= 0;
        int n= (int) Math.pow(A,B);

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            al.add(n%10);
            n/=10;
        }
        Collections.reverse(al);


        for (int i = 0; i < al.size(); i++) {
            result=result*10+ al.get(i);
        }
        return result;
    }



    public static void main(String[] args) {
        int A=5,B=4,K=2;



        int ans= lastKdigits(A,B,K);
        String a= String.valueOf(ans);
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i)+" ");
        }





    }
}
