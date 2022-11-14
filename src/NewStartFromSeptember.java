import java.util.*;


public class NewStartFromSeptember {
    public static int[] findOriginalArray(int[] arr) {
        int n = arr.length;
        if(n % 2 != 0)return new int[0];

        int[] res = new int[n/2];
        int idx = 0;

        Arrays.sort(arr);
        int j = n-1;
        Map<Integer,Integer> map = new HashMap<>();

        while(j >= 0){
            int element = arr[j];
            int twice = element * 2;

            if(map.containsKey(twice)){
                if(map.get(twice) == 1)map.remove(twice);
                else map.put(twice,map.get(twice) - 1);
                res[idx++] = element;
            }else{
                map.put(element,map.getOrDefault(element,0) + 1);
            }
            j--;
        }

        return idx == n/2 ? res : new int[0];

    }


    public static int findMidSum(int[] ar1, int[] ar2, int n) {
        if (n==1) return ar1[0]+ar2[0];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(ar1[i]);
            al.add(ar2[i]);
        }
        Collections.sort(al);
        return al.get((al.size()/2)-1)+al.get(al.size()/2);

    }

    public static int findOnce(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (Integer x: arr) al.add(x);
        for (int i = 0; i < n; i++) {
            int temp=al.get(i);
            al.remove(al.indexOf(temp));

            if (al.contains(temp)){
                al2.add(temp);
            }else if (!al2.contains(temp)){
                return temp;
            }
        }
        return -1;
    }

    public static boolean find3Numbers(int a[], int n, int x) {
        if(a.length<3) return false;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (hm.containsKey(x-a[i]+a[j])) return true;
            }
            hm.put(a[i],1);
        }
        return false;
    }

    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> al =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                al.add(0);
                al.add(0);
            }else {
                al.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=al.get(i);
        }
    }



    public static void main(String[] args) {




        //System.out.println(findOnce(new int[]{1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65},11));




      //  System.out.println(findMidSum(new int[]{1, 2, 4, 6, 10},new int[]{4, 5, 6, 9, 12},5));


//        for (int i = 1; i <=3; i++) {
//            for (int j = 1; j <=3 ; j++) {
//                if (i==2&& j==2 ||i==j) break;
//                else {
//                    System.out.println(i+j);
//                }
//            }
//
//        }

    }
}
