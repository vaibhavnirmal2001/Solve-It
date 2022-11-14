
import java.io.*;
import java.util.*;

import static java.lang.Math.*;
public class graphDEs {



    public class Main {
        static InputReader in;
        static PrintWriter out;

        public static void main(String[] args) {
            //initReaderPrinter(true);
            initReaderPrinter(false);
            //solve(in.nextInt());
            solve(1);
        }



        static class UnionFind {
            private int[] id;   //parent link
            private int[] sz;  //size of component for roots
            private int count;  //number of components

            public UnionFind(int N) {
                this.count = N;
                this.id = new int[N];
                this.sz = new int[N];
                for(int i = 0; i < N; i++) {
                    this.id[i] = i;
                    this.sz[i] = 1;
                }
            }

            public int getCount() {
                return this.count;
            }

            public boolean connected(int p, int q) {
                return findRoot(p) == findRoot(q);
            }

            private int findRoot(int p) {
                if(p != this.id[p]) {
                    this.id[p] = findRoot(this.id[p]);
                }
                return this.id[p];
            }

            public void union(int p, int q) {
                int i = findRoot(p);
                int j = findRoot(q);
                if(i == j) {
                    return;
                }

                if(this.sz[i] < this.sz[j]) {
                    this.id[i] = j;
                    this.sz[j] += this.sz[i];
                }
                else {
                    this.id[j] = i;
                    this.sz[i] += this.sz[j];
                }
                this.count--;
            }

            public int getCountInOneComponent(int p) {
                int root = findRoot(p);
                return this.sz[root];
            }
        }


        static void solve(int testCnt) {
            for (int testNumber = 0; testNumber < testCnt; testNumber++) {
                int n = in.nextInt(), m = in.nextInt();
                UnionFind uf = new UnionFind(n);
                List<Integer>[] g = new List[n];
                for(int i = 0; i < n; i++) {
                    g[i] = new ArrayList<>();
                }
                for(int i = 0; i < m; i++) {
                    int a = in.nextInt() - 1, b = in.nextInt() - 1;
                    g[a].add(b);
                }
                int[] ans = new int[n + 1]; //ans[i]: ans after removing [0, i] nodes
                //add node back to the graph, at this point the number of nodes that have been deleted is node
                for(int i = n - 1; i >= 0; i--) {
                    for(int x : g[i]) {
                        uf.union(i, x);
                    }
                    ans[i] = uf.count - i;
                }
                for(int i = 1; i <= n; i++) {
                    out.println(ans[i]);
                }
            }
            out.close();
        }

        static long addWithMod(long x, long y, long mod) {
            return (x + y) % mod;
        }

        static long subtractWithMod(long x, long y, long mod) {
            return ((x - y) % mod + mod) % mod;
        }

        static long multiplyWithMod(long x, long y, long mod) {
            return x * y % mod;
        }

        static long modInv(long x, long mod) {
            return fastPowMod(x, mod - 2, mod);
        }

        static long fastPowMod(long x, long n, long mod) {
            if (n == 0) return 1;
            long half = fastPowMod(x, n / 2, mod);
            if (n % 2 == 0) return half * half % mod;
            return half * half % mod * x % mod;
        }

        static void initReaderPrinter(boolean test) {
            if (test) {
                try {
                    in = new InputReader(new FileInputStream("src/input.in"));
                    out = new PrintWriter(new FileOutputStream("src/output.out"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                in = new InputReader(System.in);
                out = new PrintWriter(System.out);
            }
        }

        static class InputReader {
            BufferedReader br;
            StringTokenizer st;

            InputReader(InputStream stream) {
                try {
                    br = new BufferedReader(new InputStreamReader(stream), 32768);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            String next() {
                while (st == null || !st.hasMoreTokens()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt() {
                return Integer.parseInt(next());
            }

            long nextLong() {
                return Long.parseLong(next());
            }

            double nextDouble() {
                return Double.parseDouble(next());
            }

            String nextLine() {
                String str = "";
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }

            Integer[] nextIntArray(int n) {
                Integer[] a = new Integer[n];
                for (int i = 0; i < n; i++) a[i] = nextInt();
                return a;
            }

            int[] nextIntArrayPrimitive(int n) {
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = nextInt();
                return a;
            }

            int[] nextIntArrayPrimitiveOneIndexed(int n) {
                int[] a = new int[n + 1];
                for (int i = 1; i <= n; i++) a[i] = nextInt();
                return a;
            }

            Long[] nextLongArray(int n) {
                Long[] a = new Long[n];
                for (int i = 0; i < n; i++) a[i] = nextLong();
                return a;
            }

            long[] nextLongArrayPrimitive(int n) {
                long[] a = new long[n];
                for (int i = 0; i < n; i++) a[i] = nextLong();
                return a;
            }

            long[] nextLongArrayPrimitiveOneIndexed(int n) {
                long[] a = new long[n + 1];
                for (int i = 1; i <= n; i++) a[i] = nextLong();
                return a;
            }

            String[] nextStringArray(int n) {
                String[] g = new String[n];
                for (int i = 0; i < n; i++) g[i] = next();
                return g;
            }

            List<Integer>[] readUnWeightedGraphOneIndexed(int n, int m) {
                List<Integer>[] adj = new List[n + 1];
                for (int i = 0; i <= n; i++) {
                    adj[i] = new ArrayList<>();
                }
                for (int i = 0; i < m; i++) {
                    int u = nextInt();
                    int v = nextInt();
                    adj[u].add(v);
                    adj[v].add(u);
                }
                return adj;
            }

            List<int[]>[] readWeightedGraphOneIndexed(int n, int m) {
                List<int[]>[] adj = new List[n + 1];
                for (int i = 0; i <= n; i++) {
                    adj[i] = new ArrayList<>();
                }
                for (int i = 0; i < m; i++) {
                    int u = nextInt();
                    int v = nextInt();
                    int w = in.nextInt();
                    adj[u].add(new int[]{v, w});
                    adj[v].add(new int[]{u, w});
                }
                return adj;
            }

            List<Integer>[] readUnWeightedGraphZeroIndexed(int n, int m) {
                List<Integer>[] adj = new List[n];
                for (int i = 0; i < n; i++) {
                    adj[i] = new ArrayList<>();
                }
                for (int i = 0; i < m; i++) {
                    int u = nextInt() - 1;
                    int v = nextInt() - 1;
                    adj[u].add(v);
                    adj[v].add(u);
                }
                return adj;
            }

            List<int[]>[] readWeightedGraphZeroIndexed(int n, int m) {
                List<int[]>[] adj = new List[n];
                for (int i = 0; i < n; i++) {
                    adj[i] = new ArrayList<>();
                }
                for (int i = 0; i < m; i++) {
                    int u = nextInt() - 1;
                    int v = nextInt() - 1;
                    int w = in.nextInt();
                    adj[u].add(new int[]{v, w});
                    adj[v].add(new int[]{u, w});
                }
                return adj;
            }

            /*
                A more efficient way of building an undirected graph using int[] instead of ArrayList to store each node's neighboring nodes.
                1-indexed.
             */
            int[][] buildUndirectedGraph(int nodeCnt, int edgeCnt) {
                int[] end1 = new int[edgeCnt], end2 = new int[edgeCnt];
                int[] edgeCntForEachNode = new int[nodeCnt + 1], idxForEachNode = new int[nodeCnt + 1];
                for (int i = 0; i < edgeCnt; i++) {
                    int u = in.nextInt(), v = in.nextInt();
                    edgeCntForEachNode[u]++;
                    edgeCntForEachNode[v]++;
                    end1[i] = u;
                    end2[i] = v;
                }
                int[][] adj = new int[nodeCnt + 1][];
                for (int i = 1; i <= nodeCnt; i++) {
                    adj[i] = new int[edgeCntForEachNode[i]];
                }
                for (int i = 0; i < edgeCnt; i++) {
                    adj[end1[i]][idxForEachNode[end1[i]]] = end2[i];
                    idxForEachNode[end1[i]]++;
                    adj[end2[i]][idxForEachNode[end2[i]]] = end1[i];
                    idxForEachNode[end2[i]]++;
                }
                return adj;
            }

            /*
                A more efficient way of building an undirected weighted graph using int[] instead of ArrayList to store each node's neighboring nodes.
                1-indexed.
            */
            int[][][] buildUndirectedWeightedGraph(int nodeCnt, int edgeCnt) {
                int[] end1 = new int[edgeCnt], end2 = new int[edgeCnt], weight = new int[edgeCnt];
                int[] edgeCntForEachNode = new int[nodeCnt + 1], idxForEachNode = new int[nodeCnt + 1];
                for (int i = 0; i < edgeCnt; i++) {
                    int u = in.nextInt(), v = in.nextInt(), w = in.nextInt();
                    edgeCntForEachNode[u]++;
                    edgeCntForEachNode[v]++;
                    end1[i] = u;
                    end2[i] = v;
                    weight[i] = w;
                }
                int[][][] adj = new int[nodeCnt + 1][][];
                for (int i = 1; i <= nodeCnt; i++) {
                    adj[i] = new int[edgeCntForEachNode[i]][2];
                }
                for (int i = 0; i < edgeCnt; i++) {
                    adj[end1[i]][idxForEachNode[end1[i]]][0] = end2[i];
                    adj[end1[i]][idxForEachNode[end1[i]]][1] = weight[i];
                    idxForEachNode[end1[i]]++;
                    adj[end2[i]][idxForEachNode[end2[i]]][0] = end1[i];
                    adj[end2[i]][idxForEachNode[end2[i]]][1] = weight[i];
                    idxForEachNode[end2[i]]++;
                }
                return adj;
            }

            /*
                A more efficient way of building a directed graph using int[] instead of ArrayList to store each node's neighboring nodes.
                1-indexed.
            */
            int[][] buildDirectedGraph(int nodeCnt, int edgeCnt) {
                int[] from = new int[edgeCnt], to = new int[edgeCnt];
                int[] edgeCntForEachNode = new int[nodeCnt + 1], idxForEachNode = new int[nodeCnt + 1];
                //from u to v: u -> v
                for (int i = 0; i < edgeCnt; i++) {
                    int u = in.nextInt(), v = in.nextInt();
                    edgeCntForEachNode[u]++;
                    from[i] = u;
                    to[i] = v;
                }
                int[][] adj = new int[nodeCnt + 1][];
                for (int i = 1; i <= nodeCnt; i++) {
                    adj[i] = new int[edgeCntForEachNode[i]];
                }
                for (int i = 0; i < edgeCnt; i++) {
                    adj[from[i]][idxForEachNode[from[i]]] = to[i];
                    idxForEachNode[from[i]]++;
                }
                return adj;
            }

            /*
                A more efficient way of building a directed weighted graph using int[] instead of ArrayList to store each node's neighboring nodes.
                1-indexed.
            */
            int[][][] buildDirectedWeightedGraph(int nodeCnt, int edgeCnt) {
                int[] from = new int[edgeCnt], to = new int[edgeCnt], weight = new int[edgeCnt];
                int[] edgeCntForEachNode = new int[nodeCnt + 1], idxForEachNode = new int[nodeCnt + 1];
                //from u to v: u -> v
                for (int i = 0; i < edgeCnt; i++) {
                    int u = in.nextInt(), v = in.nextInt(), w = in.nextInt();
                    edgeCntForEachNode[u]++;
                    from[i] = u;
                    to[i] = v;
                    weight[i] = w;
                }
                int[][][] adj = new int[nodeCnt + 1][][];
                for (int i = 1; i <= nodeCnt; i++) {
                    adj[i] = new int[edgeCntForEachNode[i]][2];
                }
                for (int i = 0; i < edgeCnt; i++) {
                    adj[from[i]][idxForEachNode[from[i]]][0] = to[i];
                    adj[from[i]][idxForEachNode[from[i]]][1] = weight[i];
                    idxForEachNode[from[i]]++;
                }
                return adj;
            }
        }
    }
}
