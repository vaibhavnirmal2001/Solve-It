public class NewRaman {
    static int countFactors(int n){
        int res=0;
        for (int i = 1;i<n;i++){
            int c=2;
            for (int j = 2; j < n ; j++) {
                if (i%j==0) c++;
            }
            if (c==3) res++;
        }
        return res;

    }



    public static void main(String[] args) {
        //System.out.println(countFactors(6));
        String s= "ahbuei";


    }
}
