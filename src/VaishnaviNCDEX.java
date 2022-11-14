import java.util.Arrays;

public class VaishnaviNCDEX {
    public static int[] findMinCost(int a,int b, int[] c, int[] d,int[] e, int f){
        int[] ans=  new int[2];


        return ans;
    }
    public static int nthTerm(int input1,int input2,int input3)
    {

//        for (int i = 0; i < input1-1; i++) {
//            if (v[i][1]>v[i+1][0]){
//                System.out.println(v[i][1]+" "+ v[i+1][0]);
//                max--;
//            }
//        }


        input2=input2-input1;
        input1=input1-input2;
        return ( input1 + (input3 - 1) * input2 );
    }






    public static void main(String[] args) {
//        System.out.println(countPrimes(4));
        System.out.println(nthTerm(1,2,4));
    }
}
