
import java.util.*;





public class Vaibhav {
    public static int[] interChange(int[] arr){
        int[] a = new int[arr.length];
        ArrayList<Integer> al =  new ArrayList<>();
        for(Integer x: arr) al.add(x);
        for (int i = 0; i < a.length; i++) {
            a[i]=al.indexOf(i);
        }
        return a;
    }










    public static int[] FunDistance(int[] inputDist, int start, int end){
        int[] answer =  new int[100];


        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < inputDist.length; i++) {
            if (inputDist[i]>=start && inputDist[i]<=end) al.add(inputDist[i]);
        }
        int[] a= new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            a[i]=al.get(i);
        }


        return a.length==0?new int[]{-1}:a;
    }








    public static void main(String[] args) {
        System.out.println(Arrays.toString(FunDistance(new int[]{73,4,63,33,65},1,35)));
        //System.out.println(Arrays.toString(interChange(new int[]{3,2,0,1})));
    }
}
