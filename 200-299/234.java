/**234. Palindrome Linked List
 Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
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
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode prev = head;
        if(head != null && head.next == null){
            return true;
        }
        ListNode fast = head.next;
        while(fast !=  null && fast.next != null){
            head = head.next;
            fast = fast.next.next;
        }
        ListNode bob = head.next;
        head.next = null;
        reverse(prev);
        if(fast == null){
            head = head.next;
        }
        while(head != null){
            if(head.val != bob.val){
                return false;
            }
            head = head.next;
            bob = bob.next;
        }
        
        return true;
    }
    public ListNode reverse(ListNode head){
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
}