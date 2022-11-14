import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SatisfyTheEquation {
    static int[] satisfyEqn(int[] A, int N) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<N;i++)
            for (int j = i + 1; j < N; j++)
                for (int k = 0; k < N; k++)
                    for (int l = k + 1; l < N; l++) {
                        if (!(i < j && i < k && k < l && j != k && j != l)) continue;

                        if (A[i] + A[j] == A[k] + A[l]) {

                            list.add(i);
                            list.add(j);
                            list.add(k);
                            list.add(l);

                            return list.stream().mapToInt(p -> p).toArray();
                        }
                    }

        return new int[]{-1,-1,-1,-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(satisfyEqn(new int[]{3, 4, 7, 1, 2, 9, 8},7)));
    }
}
