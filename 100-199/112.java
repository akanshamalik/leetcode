
/**112. Path Sum
 *Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
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
// Using Recurssion 
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null && sum - root.val ==0){
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        
    }
}

// Using DFS
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        Stack<TreeNode> node_stack = new Stack<>();
        Stack<Integer> sum_stack = new Stack<>();
        node_stack.push(root);
        sum_stack.push(sum - root.val);
        while(!node_stack.isEmpty()){
            TreeNode x = node_stack.pop();
            int y = sum_stack.pop();
            if(x.left == null && x.right == null && y ==0){
                return true;
            }
            if(x.left != null){
                node_stack.push(x.left);
                sum_stack.push(y -x.left.val);
            }
              if(x.right != null){
                node_stack.push(x.right);
                sum_stack.push(y -x.right.val);
            }
        }
        return false;
    }
}