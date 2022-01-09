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
    public int pairSum(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        if(head == null) return 0;
        
        if(head.next.next == null) return head.val+head.next.val;
        
        while(fast!= null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        
        ListNode secondHalf = slow;
       // slow.next = null;
        //[47,22,81,46,94,95,90,22,55,91,6,83,49,65,10,32,41,26,83,99,14,85,42,99,89,69,30,92,32,74,9,81,5,9]
        ListNode prev = null;
        while(secondHalf != null){
            ListNode next = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = next;
        }
        
        int res = 0;
        while(prev != null) {
            res = Math.max(res, head.val + prev.val);
            System.out.println(prev.val);
            head = head.next;
            prev = prev.next;
        }
    return res;
    }
}