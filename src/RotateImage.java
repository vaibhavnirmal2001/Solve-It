import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] a) {
        for(int i = 0; i<a.length; i++){
            for(int j = i; j<a[0].length; j++){
                int temp;
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }


        for(int i =0 ; i<a.length; i++){
            for(int j = 0; j<a.length/2; j++){
                int temp=a[i][j];
                a[i][j]=a[i][a.length-1-j];
                a[i][a.length-1-j]=temp;
            }
        }

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mtx= {{1,2,3},{4,5,6},{7,8,9}};
        rotate(mtx);
        System.out.println(Arrays.deepToString(mtx));
    }
}
