import java.util.Arrays;

public class SamikshaCode {
    public static int maxSalary(int[][] taks){
        int high=0,temp=0;
        int[] a=new int[taks.length];


        for (int i = 0; i < taks.length; i++) {

            a[i]=taks[i][1]/taks[i][0];
        }
        Arrays.sort(a);
        return a[a.length-1]*a[a.length-2];
    }

    public static void main(String[] args) {
        System.out.println(maxSalary(new int[][]{{4,2},{1,2},{4,10}, {20, 21},{2,23}}));
    }


}
