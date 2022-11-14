import java.util.ArrayList;
import java.util.Arrays;

public class NitinQuestions {
//    public static int countCustomers(int[] bill){
//        int answer=0;
//        for (int i = 0; i < bill.length; i++) {
//            int sr = (int)Math.sqrt(bill[i]);
//
//
//
//            if ((sr * sr) == bill[i]) answer++;
//        }
//
//        return answer;
//    }

    public static int[] streetLight(int[] currentState, int days){
        int[] answer =  new int[currentState.length];
        int[] temp =  new int[currentState.length];



        while (days-->0){
            temp[0]=answer[0];
            for (int i = 1; i <answer.length-1 ; i++) {
                int ans=answer[i-1]==answer[i+1]?0:1;
                temp[i]=ans;
            }

            temp[answer.length-1]=(answer[answer.length-1]);

            for (int i = 0; i < temp.length; i++) {
                answer[i]=temp[i];
            }
        }


        return answer;
    }
    public static void main(String[] args) {
       // System.out.println(countCustomers(new int[]{25,77,54,81,48,34}));
        System.out.println(Arrays.toString(streetLight(new int[]{1,1,1,0,1,1,0},2)));
    }
}
