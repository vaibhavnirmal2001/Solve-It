import java.util.ArrayList;

public class DeleteNodeGreaterOnRight {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static Node compute(Node head) {
        // finding head
        Node newNode=reverse(head);
        Node ans=newNode;
        int max=newNode.data;
        Node temp=newNode;
        while(newNode!=null) {
            if(newNode.data<max){
                temp.next=newNode.next;
            }
            else {
                max=newNode.data;
                temp=newNode;
            }
            newNode=newNode.next;
        }
        return reverse(ans);
    }
    public static Node reverse(Node head) {
        Node current=head;
        Node previous=null;
        Node next=null;

        while(current!=null) {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }

}
