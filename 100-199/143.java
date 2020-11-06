/**143. Reorder List
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…You may not modify the values in the list's nodes, only nodes itself may be changed.

Example 1:
Given 1->2->3->4, reorder it to 1->4->2->3.

Example 2:
Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 
 */

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
    public void reorderList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
       ListNode x = slow.next;
        slow.next = null;
        
        ListNode y = reverseList(x);
        
        merge(head,y);
        
    }
     public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummy = null;
        ListNode fast = null;
        while(head != null){
            fast = head.next;
            head.next = dummy;
            dummy = head;
            head = fast;
        }
        return dummy;
        
    }
     public void merge(ListNode l1, ListNode l2) {
    
        while( l1 != null && l2 != null){

        ListNode n1 = l1.next, n2 = l2.next;
        l1.next = l2;
        
        if (n1 == null)
          return;
            
        l2.next = n1;
        l1 = n1;
        l2 = n2;
      
        }
    }
}