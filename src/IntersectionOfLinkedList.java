public class IntersectionOfLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1=0,length2=0;
        ListNode curr1=headA,curr2=headB,longer,shorter;
        while (curr1!=null){
            curr1=curr1.next;
            length1++;
        }
        while (curr2!=null) {
            curr2=curr2.next;
            length2++;
        }
        int k=Math.abs(length1-length2);
        if (length1>length2){
            longer=headA;
            shorter=headB;
        }else {
            longer=headB;
            shorter=headA;
        }
        for (int i = 0; i < k; i++) {
            longer=longer.next;
        }

        while (shorter!=null && longer!=null){
            if (longer==shorter) return shorter;
            shorter=shorter.next;
            longer=longer.next;
        }
        return null;
    }
}
