import java.util.*;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        ArrayList<Integer> row,previous=null;

        for (int i = 0; i < numRows; ++i) {
            row=new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j==0 || j==i){
                    row.add(1);
                }else {
                    row.add(previous.get(j)+previous.get(j-1));
                }
            }
            previous=row;
            al.add(row);
        }
        return al;
    }

    public static void main(String[] args) {
        System.out.println( generate(5));
    }
}
