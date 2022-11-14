import java.io.*;
import java.util.*;
 class newSolPhone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sa = br.readLine().split(" ");
        int n = Integer.parseInt(sa[0]);
        int m = Integer.parseInt(sa[1]);
        List<List<Integer>> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            sa = br.readLine().split(" ");
            int a = Integer.parseInt(sa[0]) - 1;
            int b = Integer.parseInt(sa[1]) - 1;
            list.get(a).add(b);
        }
        br.close();

        UnionFind uf = new UnionFind(n);
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = uf.num - i - 1;
            for (int j : list.get(i)) {
                uf.union(i, j);
            }
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (int i : ans) {
            pw.println(i);
        }
        pw.flush();
    }

    static class UnionFind {
        int[] parent, size;
        int num = 0;

        UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            num = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        void union(int x, int y) {
            int px = find(x);
            int py = find(y);
            if (px != py) {
                parent[px] = py;
                size[py] += size[px];
                num--;
            }
        }

        int find(int x) {
            if (parent[x] == x) {
                return x;
            }
            parent[x] = find(parent[x]);
            return parent[x];
        }

        boolean same(int x, int y) {
            return find(x) == find(y);
        }

        int size(int x) {
            return size[find(x)];
        }
    }
}


