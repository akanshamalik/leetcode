import java.util.Queue;

/*

104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.

*/




/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(final TreeNode root) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for(int i=0; i< size; i++){
                if(queue.peek().left !=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right !=null){
                    queue.offer(queue.peek().right);
                }
            queue.poll();
            }
            count++;
        }
        return count;
    }
}