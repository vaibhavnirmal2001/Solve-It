import java.util.ArrayList;

public class EliminationGame {
    public static int lastRemaining(int n) {
        boolean flag=false;
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            al.add(i);
        }

        while (al.size()>1){
            while (al.contains(0)){
                al.remove(al.indexOf(0));
            }
            if (!flag) {
                for (int i = 0; i < al.size()&&al.size()>1; i++) {
                    if ((i+1) % 2 != 0) al.set(i,0);
                }
                flag = true;
            } else {
                for (int i = 0; i < al.size()&&al.size()>1; i++) {
                    if ((i+1) % 2 == 0) al.set(i,0);
                }
                flag = false;
            }
        }
        while (al.contains(0)){
            al.remove(al.indexOf(0));
        }
        return al.get(0);

    }
    public static void main(String[] args) {
        System.out.println(lastRemaining(4));
    }
}
