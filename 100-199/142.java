/**142. Linked List Cycle II

 Given a linked list, return the node where the cycle begins. If there is no cycle, return null.There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Notice that you should not modify the linked list.

Follow up:
Can you solve it using O(1) (i.e. constant) memory?

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
 */


public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode p = helper(head);
        if(p == null){
            return null;
        }
        while(head != p){
            head = head.next;
            p = p.next;
     
        }
        return head;
    }
    public ListNode helper(ListNode head){
    
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if( slow == fast){
                return slow;
            }
        }
        
        return null;
    }
}