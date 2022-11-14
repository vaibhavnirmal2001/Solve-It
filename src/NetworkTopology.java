import java.io.*;
import java.util.*;

public class NetworkTopology {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int M = sc.nextInt();

            HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
            for(int i = 1; i <= N; i++)
                graph.put(i, new ArrayList<Integer>());

            for(int i = 0; i < M; i++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                graph.get(X).add(Y);
                graph.get(Y).add(X);
            }

            int v1 = 0, v2 = 0, v3 = 0;
            for(int i = 1; i <= N; i++) {
                ArrayList<Integer> currentArrayList = graph.get(i);
                if(currentArrayList.size() == 1)
                    v1++;
                else if(currentArrayList.size() == 2)
                    v2++;
                else
                    v3++;
            }

            if(v1 == N - 1 && v2 == 0 && v3 == 1) {
                System.out.println("star topology");
            } else if(v1 == 2 && v2 == N - 2 && v3 == 0) {
                System.out.println("bus topology");
            } else if(v1 == 0 && v2 == N && v3 == 0) {
                System.out.println("ring topology");
            } else {
                System.out.println("unknown topology");
            }

        }

}
