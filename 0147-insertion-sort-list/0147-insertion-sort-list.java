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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        
        ListNode curr=head;
        
        while(curr!=null){
            al.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(al);
        curr=head;
        
        int i=0;
        while(curr!=null){
            curr.val=al.get(i);
            curr=curr.next;
            i++;
        }
        return head;
        
    }
}