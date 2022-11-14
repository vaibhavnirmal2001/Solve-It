public class LinkedListCycle {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while (fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) return true;
        }
        return false;
    }
}
