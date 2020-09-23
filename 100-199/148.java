/**148. Sort List

 Given the head of a linked list, return the list after sorting it in ascending order.
Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?

Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode fast = head;
        while(fast != null && fast.next !=  null){
            prev = prev.next;
            // x = x.next;
            fast = fast.next.next;
        }
        ListNode x = null; 
        x = prev.next;
        prev.next = null;
        ListNode l1 = sortList(x);
        ListNode l2 = sortList(head);
        
        return merge(l1,l2);
    }
     private ListNode merge(ListNode l1, ListNode l2) {
       ListNode l = new ListNode(0), p = l;
    
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        p.next = l1;
        l1 = l1.next;
      } else {
        p.next = l2;
        l2 = l2.next;
      }
      p = p.next;
    }
    
    if (l1 != null)
      p.next = l1;
    
    if (l2 != null)
      p.next = l2;
    
    return l.next;
    }
}