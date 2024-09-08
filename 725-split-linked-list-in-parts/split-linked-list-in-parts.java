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
    int size(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = size(head);
        ListNode[] ll = new ListNode[k];

        ListNode cpy = head;
        while (k >= len) {
            for (int i = 0; i < len; i++) {
                ListNode temp = head.next;
                head.next = null;
                ll[i] = head;
                head = temp;
            }
            for (int i = len; i < k; i++) {
                ll[i] = null;
            }
            return ll;
        }

        ListNode h1 = head;
        int ext = len % k;
        for (int i = 0; i < k; i++) {
            ListNode temp = h1;
            for (int j = 1; j < (len / k); j++) {
                h1 = h1.next;
            }
            if (ext > 0) {
                h1 = h1.next;
                ext--;
            }
            ListNode newNode = h1.next;
            h1.next = null;
            h1 = newNode;
            ll[i] = temp;
        }

        return ll;
    }
}