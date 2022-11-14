import java.util.ArrayList;

public class NumberOfChicks {
    public static long NoOfChicks(int n) {
        ArrayList<Long> al = new ArrayList<>();
        al.add(0L);
        for (long i = 1; i <=n ; i++) {
            al.add((i*(i+1)/2)+i);
        }
        return al.get(n);
    }

    public static void main(String[] args) {
        System.out.println(NoOfChicks(2));
    }

}
