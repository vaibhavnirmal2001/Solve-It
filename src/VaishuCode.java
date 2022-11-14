import java.util.Arrays;

public class VaishuCode {

    public static int[] funcArrange(int[] inputArr){
        int temp=0;
        int a=0;
        for(int i=0;i<inputArr.length;i++){
            if(inputArr[i]%2==0){

                for (int j=i;j>a;j--){
                    temp=inputArr[j-1];
                    inputArr[j-1]=inputArr[j];
                    inputArr[j]=temp;
                }
                a++;
            }
        }
        return inputArr;
    }


    public static int[] streetLight(int[] currentState, int days){
        int n= currentState.length;
        boolean[] temp = new boolean[n];
        for (int i = 0; i < n; i++) {
            temp[i] = currentState[i] == 1;
        }
        boolean[] arr= new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = currentState[i] == 1;
        }

        while (days-->0){
            temp[0] = false ^ arr[1];
            temp[n - 1] = false ^ arr[n - 2];

            for (int i = 1; i <= n - 2; i++) {
                temp[i] = arr[i - 1] ^ arr[i + 1];
            }
            for (int i = 0; i < n; i++)
                arr[i] = temp[i];
             }
        int[] ans= new int[n];
        for (int i = 0; i < n; i++) {
            ans[i]=arr[i]?1:0;
        }
        return ans;
    }





    public static void main(String[] args) {
       // System.out.println(Arrays.toString(funcArrange(new int[]{10,98,3,33,12,22,21,11})));
        System.out.println(Arrays.toString(streetLight(new int[]{1,1,1,0,1,1,1,1},2)));
    }
}
