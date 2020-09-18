/**669. Trim a Binary Search Tree
 Given the root of a binary search tree and the lowest and highest boundaries as low and high, trim the tree so that all its elements lies in [low, high]. You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

Example 1:
Input: root = [1,0,2], low = 1, high = 2
Output: [1,null,2]
 */

class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null){
            return null;
        }
        if(root.val >high){
            return trimBST(root.left, low,high);
        }
        if(root.val < low){
            return trimBST(root.right,low,high);
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        
        return root;
    }
}