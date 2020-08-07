/**100. Same Tree
 Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
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

 // Using DFS
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        
        List<Integer> l1 = Inorder(p);         
        List<Integer> l2 = Inorder(q);  
        // System.out.println(l1);
        // System.out.println(l2);
        return l1.equals(l2);
    }
    public List<Integer> Inorder(TreeNode p){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while( p!= null || !stack.isEmpty()){
            if(p!= null){
                stack.push(p);
                p = p.left;
            }
            else{
                TreeNode x = stack.pop();
                if((x.left == null && x.right != null) ||(x.left != null && x.right == null)){
                    
                list.add(0);
                }
                list.add(x.val);
                p = x.right;
            }
        }
        return list;
        
    } 
}

// Using Recurssion 
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        
        return isSameTree(p.left, q.left) && isSameTree(p.right , q.right);
    } 
}

//Using BFS
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(p);
        que.offer(q);
        while(!que.isEmpty()){
            TreeNode x = que.poll();
            TreeNode y = que.poll();
            if(x == null && y == null){
                continue;
            }
            if(x == null || y == null){
                return false;
            }
            if(x.val != y.val){
                return false;
            }
            que.add(x.left);
            que.add(y.left);
            que.add(x.right);
            que.add(y.right);
        }
        
        
        return true;
    } 
}