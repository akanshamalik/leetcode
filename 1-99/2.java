/**2. Add Two Numbers
 * 
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
                return new ListNode(l2.val, addTwoNumbers(l1 , l2.next ));
        }
        if(l2 == null){
                return new ListNode(l1.val, addTwoNumbers(l1.next, l2));
        }
        if(l1.val + l2.val > 9){
                 int c = (l1.val + l2.val);
                if(l1.next == null){
                    l1.next = new ListNode(c/10);
                    return new ListNode(c%10, addTwoNumbers(l1.next , l2.next)); 
                }else if(l2.next == null){
                    l2.next = new ListNode(c/10);
                    return new ListNode(c%10, addTwoNumbers(l1.next , l2.next)); 
                }else{
                    l1.next.val = l1.next.val + c/10;
                    return new ListNode(c%10, addTwoNumbers(l1.next , l2.next)); 
                }
            
        }else{
            return new ListNode(l1.val + l2.val, addTwoNumbers(l1.next , l2.next));
               
        
        }
    }
}
