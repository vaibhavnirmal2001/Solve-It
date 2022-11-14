import java.util.*;

public class CognizantQuestions {
    public static void binarySortArray(int[] a){
        String[] s = new String[a.length];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            s[i]=Integer.toBinaryString(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            al.add(Integer.parseInt(s[i]));
        }
        Collections.sort(al);
        Collections.reverse(al);
        for (int i = 0; i < al.size(); i++) {
            a[i]=Integer.parseInt(String.valueOf(al.get(i)),2);
        }

        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        binarySortArray(a);
//        System.out.printf(String.valueOf(a));

    }
}
