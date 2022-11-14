import java.util.*;

public class ChocolateDistribution {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m){
        Collections.sort(a);

        Integer[] arr = a.toArray(new Integer[0]);
        int i =0,j = 0;
        int min = Integer.MAX_VALUE;
        while (j < arr.length){
            if (j-i+1 == m){
                min = Math.min(min,arr[j]-arr[i]);
                i++;
            }
            j++;
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(1);
        al.add(9);
        al.add(56);
        al.add(7);
        al.add(9);
        al.add(12);
        System.out.println(findMinDiff(al,8,5));
    }
}

//9623717542
//rahul gagare
//3, 4, 1, 9, 56, 7, 9, 12)