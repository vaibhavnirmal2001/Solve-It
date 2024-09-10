/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  private int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  public ListNode insertGreatestCommonDivisors(ListNode head) {
    var p = head;

    while (p.next != null) {
      var newNode = new ListNode(gcd(p.val, p.next.val), p.next);
      p.next = newNode;
      p = newNode.next;
    }
    return head;
  }
}