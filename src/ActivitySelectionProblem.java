import java.util.*;

public class ActivitySelectionProblem {
    public static int activitySelection(int[] start, int[] end, int n){
        Pair[] arr = new Pair[n];

        for(int i=0; i<n; i++) arr[i] = new Pair(start[i], end[i]);

        Arrays.sort(arr, Comparator.comparingInt(p -> p.en));

        int pre = 0, res = 1;

        for(int curr = 1; curr<n; curr++){
            if(arr[curr].st > arr[pre].en){
                res++;
                pre = curr;
            }
        }

        return res;
    }

    private static class Pair{
        int st, en;
        Pair(int s, int e){
            st = s;
            en = e;
        }
    }
}
