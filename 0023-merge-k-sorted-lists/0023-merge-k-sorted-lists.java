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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        
        ListNode head = new ListNode(0); // dummy node head
        ListNode temp = head; // taking into temporary variable
        List<Integer> l = new ArrayList<>();
        for(ListNode list : lists){ // adding all the values in the list
            while(list != null){
                l.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(l); // sorting that list we get above
        for(int val : l){ // iterating over the list & creating new single linked list
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return head.next;
    }
}