import java.util.ArrayList;
import java.util.Collections;

class Node{
        int data;
        Node next;
    Node left,right;
        Node(int d) {
            data = d;
            next = null;
            this.left=this.right=null;
        }
    }
        public class ReorderLL {
    static Node reorderlist(Node head) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        Node curr=head;
        while (curr!=null){
            al.add(curr.data);
            al2.add(curr.data);
            curr=curr.next;
        }
        Collections.reverse(al2);
        curr=head;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i)==al2.get(i)){
                curr.data=al.get(i);
                break;
            }
            curr.data=al.get(i);
            curr=curr.next;
            curr.data=al2.get(i);
            curr=curr.next;
        }
        return head;

    }


    public static void main(String[] args) {

    }
}
