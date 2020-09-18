/**110. Balanced Binary Tree
 Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

Example 1:
Given the following tree [3,9,20,null,null,15,7]:

    3
   / \
  9  20
    /  \
   15   7
 */

 
class Solution {
    public boolean isBalanced(TreeNode root) {
       if(root == null){
           return true;
       }
        
        return (Math.abs(helper(root.left) - helper(root.right)) <2) && isBalanced(root.right) && isBalanced(root.left);
    }
    
    public int helper(TreeNode root){
        if(root == null){
            return -1;
        }
        return 1+Math.max(helper(root.left), helper(root.right));
    }
}