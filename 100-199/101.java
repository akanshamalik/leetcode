/**101. Symmetric Tree
 Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
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

 // Using Recursion 
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
       return  match(root.left, root.right);
    }
    
    private boolean match(TreeNode p , TreeNode q){
        if( p == null && q == null){
            return true;
        }
        if( p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        
        return match(p.left , q.right) && match(p.right , q.left);
    }
}

// Using Iterative Method(Queue)

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode q = queue.poll();
            TreeNode y = queue.poll();
            if(q == null && y == null){
                continue;
            }
            if(q == null || y == null){
                return false;
            }
            if(q. val != y.val){
                return false;
            }
            queue.add(q.left);
            queue.add(y.right);
            queue.add(q.right);
            queue.add(y.left);
            
        }
        
        return true;
    }
}