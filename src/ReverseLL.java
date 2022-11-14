public class ReverseLL {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode reverseList(ListNode head) {
        if (head==null || head.next==null) return head;

        ListNode curr = head, prev= null, temp=null;
        while(curr != null){
            temp = curr.next;
            curr.next=prev;
            prev= curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
