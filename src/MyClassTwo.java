import java.util.*;

public class MyClassTwo {
    public static int calculate(int n){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        int temp=0;

        for (int i = 0; i < n; i++) {
            al.add(temp);
            temp++;
        }
        int count=0;
        for (int i = 1; i < al.size()-1; i++) {
            if (al.get(i)*2 > al.get(i-1)+al.get(i+1)){
                count++;
            }else {
                    al.set(i,al.get(i-1)+al.get(i+1)+1);
                    i--;
            }
        }
        return count+2;

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(calculate(k));
    }
}
