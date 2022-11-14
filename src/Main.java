//
//
//import java.util.*;
//import java.io.*;
//
//public class Main {
//    public static int nonrep(int[] arr){
//        int n=arr.length;
//        Map<Integer, Integer> m = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            if (m.containsKey(arr[i])) {
//                m.put(arr[i], m.get(arr[i]) + 1);
//            }
//            else {
//                m.put(arr[i], 1);
//            }
//        }
//
//        for (int j : arr)
//            if (m.get(j) == 1)
//                return j;
//        return -1;
//    }
//    public static void main(String[] args) {
//        int [] arr = new int [] {50,50, 10,10, 40, 30, 20};
//        int temp = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(nonrep(new int [] {50,50, 10,10, 40, 30, 20}));
//    }
//}
//
//
//
//
//
//



import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        while (scn.hasNext()){
            int t= scn.nextInt();

            if (!al.contains(t)){
                al.add(t);
            }
        }

        for (Integer r: al) System.out.print(r+ " ");
    }
}