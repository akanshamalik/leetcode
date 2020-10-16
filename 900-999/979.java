/**979. Distribute Coins in Binary Tree

 Given the root of a binary tree with N nodes, each node in the tree has node.val coins, and there are N coins total.In one move, we may choose two adjacent nodes and move one coin from one node to another.  (The move may be from parent to child, or from child to parent.)Return the number of moves required to make every node have exactly one coin.

Example 1:
Input: [3,0,0]
Output: 2
Explanation: From the root of the tree, we move one coin to its left child, and one coin to its right child
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
    int ans;
    public int distributeCoins(TreeNode root) {
        ans =0;
        helper(root);
        return ans;
    }
    
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int left =helper(root.left);
        int right = helper(root.right);
        ans += Math.abs(left) + Math.abs(right);
        return root.val +left + right -1;
    }
}
