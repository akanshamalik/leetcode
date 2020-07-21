/**203. Remove Linked List Elements
 Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode prev = new ListNode(0);
        ListNode x = prev;
        prev.next = head;
        while( head != null ){
            if(head.val == val){
                prev.next = head.next;
                head = prev.next;
            }
            else{
                head = head.next;
                prev = prev.next;
            }
        }
        
        return x.next;
    }
}