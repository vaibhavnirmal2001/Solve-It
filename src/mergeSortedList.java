import java.util.ArrayList;
import java.util.Collections;

public class mergeSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null) return list2;
        if (list2==null) return list1;
        ListNode curr=list1;
            while (curr.next!=null){
                curr=curr.next;
            }
            curr.next=list2;

            ArrayList<Integer> al= new ArrayList<>();

            curr=list1;
            while (curr!=null){
                al.add(curr.val);
                curr=curr.next;
            }
            Collections.sort(al);

            curr=list1;
            int i=0;
            while (curr!=null){
                curr.val=al.get(i);
                curr=curr.next;
                i++;
            }
            return list1;
        }

    public static void main(String[] args) {

    }
}
