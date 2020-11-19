/**111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 2

Example 2:
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5


  */ 


  class Solution {
    public int minDepth(TreeNode root) {
        if(root ==  null){
              return 0;
      }
        if(root.left == null && root.right == null){
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if(root.left != null){
            min = Math.min(minDepth(root.left), min);
        }
        if(root.right != null){
            min = Math.min(minDepth(root.right), min);
        }
        return min+1;
        
    }
  }