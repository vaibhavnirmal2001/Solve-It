import java.util.Arrays;

public class SetZeroes{

    public static int[][] setZeroes(int[][] a) {
        int[] rowTrack = new int[a.length];
        int[] columnTrack = new int[a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j]==0){
                    rowTrack[i]=1;
                    columnTrack[j]=1;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (rowTrack[i]==1 || columnTrack[j]==1){
                    a[i][j]=0;
                }
            }
        }
        return a;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(setZeroes(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}})));
    }
}