// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
// class Solution {
    
    
//     boolean isSafe(int x,int y,int m[][],int visited[][],int n){

//       if(x<0||y<0||x>=n||y>=n||m[x][y]==0||visited[x][y]==1) return false;

//       else return true;

//   }

//   ArrayList<String>ans=new ArrayList<String> (); 

//   private  void solve(int x,int y,int m[][],int visited[][],String path,int n){
//       if(x==n-1 &&y==n-1){
//           ans.add(path);
//           return;
//       }
//       visited[x][y]=1;
    
//     //up
//       if(isSafe(x-1,y,m,visited,n)){
//           path+="U";
//           solve(x-1,y,m,visited,path,n);
//           int len=path.length();
//           path=path.substring(0,len-1);
//       }

//       //down

//       if(isSafe(x+1,y,m,visited,n)){
//           path+="D";
//           solve(x+1,y,m,visited,path,n);   
//           int len=path.length();
//           path=path.substring(0,len-1);
//       }

//       //left
//       if(isSafe(x,y-1,m,visited,n)){
//           path+="L";
//           solve(x,y-1,m,visited,path,n);  
//           int len=path.length();
//           path=path.substring(0,len-1);
//       }

//       //right

//       if(isSafe(x,y+1,m,visited,n)){
//           path+="R";
//           solve(x,y+1,m,visited,path,n); 
//           int len=path.length();
//           path=path.substring(0,len-1);
//       }
//       visited[x][y]=0;
//   }

//   public  ArrayList<String> findPath(int[][] m, int n) {

     

//      if(m[0][0]==0)return ans;

//      int visited[][]=new int[n][n];

//      int x=0,y=0;

//      String path="";

//      solve(x,y,m,visited,path,n);

//      Collections.sort(ans);

//      return ans;

//   }
// }



class Solution {
    public static int[][] visited = new int[5][5];
    public static ArrayList<String> result = new ArrayList<String>();

    public static void path(int[][] m, int x, int y, String dir, int n) {
        if (x == n - 1 && y == n - 1) {
            result.add(dir);
            return;
        }

        if (m[x][y] == 0 || visited[x][y] == 1) {
            return;
        }

        visited[x][y] = 1;
        if (x > 0) {
            path(m, x - 1, y, dir + 'U', n);
        }
        if (y > 0) {
            path(m, x, y - 1, dir + 'L', n);
        }
        if (x < n - 1) {
            path(m, x + 1, y, dir + 'D', n);
        }
        if (y < n - 1) {
            path(m, x, y + 1, dir + 'R', n);
        }
        visited[x][y] = 0;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        try {
            Arrays.fill(visited, 0);
        } catch (ArrayStoreException ex) {
        }
        result.clear();
        if (m[0][0] == 0 || m[n - 1][n - 1] == 0) {
            return result;
        }

        path(m, 0, 0, "", n);
        Collections.sort(result);
        return result;
    }
}



































