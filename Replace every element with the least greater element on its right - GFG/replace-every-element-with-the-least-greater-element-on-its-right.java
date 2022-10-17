//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.findLeastGreater(n, arr);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        int[] visited = new int[100001];
        int[] sortedarr = Arrays.copyOf(arr , n);
        for(int i = 0 ; i < n ; i++){
            visited[arr[i]]++;
        }
        ArrayList<Integer> arrlist = new ArrayList<>();
        Arrays.sort(sortedarr);
        l:
        for(int i = 0 ; i < n ;i ++){
            visited[arr[i]]--;
            int a = arr[i];
            int index = Arrays.binarySearch(sortedarr , a);
            while(index < n-1 && sortedarr[index] == sortedarr[index +1]){index++;}
            if(index == n-1){arrlist.add(-1);continue l;}
            index++;
            while(index < n){
                if(visited[sortedarr[index]] <= 0 ){index++;}

                else{
                    break;
                }
            }
            if(index == n ){arrlist.add(-1);}
            else {
                arrlist.add(sortedarr[index]);
            }
        }

        return arrlist;
    }
}
        
