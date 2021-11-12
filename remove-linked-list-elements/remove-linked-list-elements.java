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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        
        ListNode current = head;
        
        while(current!=null  && current.next != null) {
            while(current.next!=null && current.next.val == val) {
              current.next = current.next.next;
            }
           
            current= current.next;
        }
        
        if(head.val == val) head = head.next;
        if(current!=null && current.val == val) current = null;
        
    return head;
        
    }
}