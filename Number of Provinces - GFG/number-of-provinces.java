//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0;i<V;i++){
            al.add(new ArrayList<>());
        }
        
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(adj.get(i).get(j)==1 &&i!=j){
                    al.get(i).add(j);
                    al.get(j).add(i);
                }
            }
        }
        int[] vis = new int[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                count++;
                dfs(i,al,vis);
            }
        }
        return count;
    }
    private static void dfs(int node, ArrayList<ArrayList<Integer>> al, int[] vis){
        vis[node]=1;
        for(Integer x: al.get(node)){
            if(vis[x]==0){
                dfs(x,al,vis);
            }
        }
    }
};






