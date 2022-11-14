
import java.util.*;


public class OddOccurrences {
    static Node segregate(Node head){
        Node curr=head;

        int z=0,o=0,t=0;
        while(curr!=null){
            if(curr.data==0) z++;
            else if(curr.data==1) o++;
            else if(curr.data==2) t++;
            curr= curr.next;
        }

        curr=head;

        while(z-->0){
            curr.data=0;
            curr=curr.next;
        }

        while(o-->0){
            curr.data=1;
            curr=curr.next;
        }

        while(t-->0){
            curr.data=2;
            curr=curr.next;
        }

        return head;
    }
    public static int[] twoOddNum(int[] a,int n) {
                int[] ans = new int[2];
                Map<Integer,Integer> map = new TreeMap<>();
                for(int i : a) {
                    map.put(i,map.getOrDefault(i,0)+1);
                }

                int ind = 1;
                for(int i : map.keySet()) {
                    if(map.get(i) % 2 != 0) {
                        ans[ind--] = i;
                    }
                }
                return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoOddNum(new int[]{4, 2, 4, 5, 2, 3, 3, 1},8)));
    }

}
