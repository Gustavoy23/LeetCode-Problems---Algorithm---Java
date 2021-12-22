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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode current = head;
        List<Integer> list = new ArrayList<>();
        
        if(head== null || head.next == null || head.next.next == null) return head;
        
        int index = 0;
        while(current != null) {
            index++;
            list.add(current.val);
            current = current.next;
        }
        
        int n = index;
        
        current = head;
        current = current.next;
        ListNode dummy = new ListNode(-1);
        
        ListNode ans = new ListNode();
        dummy.next = ans;
        int i = 0;
        int even = 1;
        index =0;
        int prev = 0;
        while(i < n && index < n) {
            
            
            if(i+even > n) {
                even = (n)-index;
                i = n;
                
            }else {
                i = index+even;
            }
            
            if(even % 2 == 0 ) {
                
                for(int j = i-1; j >= i-even && j <n; j--){
                   ans.next = new ListNode(list.get(j));
                   ans = ans.next;
                    index++;
                }
            } else {
                 for(int j = i-even; j<n && j < i; j++){
                    ans.next = new ListNode(list.get(j));
                    ans = ans.next;
                    index++;
                }
            }
           even++;
           
        }
    return dummy.next.next;
    }
}