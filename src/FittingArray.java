import java.util.*;

public class FittingArray {
    public static boolean isFit (int arr[], int brr[], int n) {
        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int i = 0; i < n; i++) {
            if (!(arr[i]<=brr[i])) return false;
        }
        return true;
    }
    static int minimumChanges(int arr[], int n) {
        int i;
        int changes = 0;

        for (i = 0; i < n; i++) {

            if (arr[i] == 1) {
                int j;

                for(j = i + 1; j < n; j++) {
                    if(arr[j] == 0)
                        break;
                }
                i = j - 1;
                changes++;
            }
        }

        return changes;
    }



    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t= sc.nextInt();


        while(t-->0){
            int[] a=  new int[3];
            for (int i = 0; i < 3; i++) {
                a[i]=sc.nextInt();

            }
            System.out.println(minimumChanges(a,3));


        }



    }
}
