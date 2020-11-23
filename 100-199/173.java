/**173. Binary Search Tree Iterator

 Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.Calling next() will return the next smallest number in the BST.

Example:
BSTIterator iterator = new BSTIterator(root);
iterator.next();    // return 3
iterator.next();    // return 7
iterator.hasNext(); // return true
iterator.next();    // return 9
iterator.hasNext(); // return true
iterator.next();    // return 15
iterator.hasNext(); // return true
iterator.next();    // return 20
iterator.hasNext(); // return false 
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
class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode x = stack.pop();
        TreeNode curr = x;
        if(curr.right != null){
            curr = curr.right;
            stack.push(curr);
            while(curr.left != null){
                curr = curr.left;
                stack.push(curr);
            }
        }
        
        return x.val;
        
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
      return !stack.isEmpty();
    }    
    
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */