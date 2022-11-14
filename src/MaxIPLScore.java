import java.util.*;

public class MaxIPLScore {

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        Deque<Integer> pq = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!pq.isEmpty() && arr[pq.peekLast()]<=arr[i]){
                pq.removeLast();
            }
            pq.addLast(i);
        }
        for(int i=k;i<n;i++){
            al.add(arr[pq.peek()]);
            while(!pq.isEmpty() && pq.peek()<=i-k){
                pq.remove();
            }
            while(!pq.isEmpty() && arr[pq.peekLast()]<=arr[i]){
                pq.removeLast();
            }
            pq.addLast(i);
        }
        al.add(arr[pq.peek()]);
        return al;
    }
    public static void main(String[] args) {

    }
}
