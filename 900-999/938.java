/**938. Range Sum of BST
 * 
 Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
The binary search tree is guaranteed to have unique values.

Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
 */

class Solution {
    int sum =0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        }
        if(L <= root.val && root.val <= R){
            sum += root.val;
        }
        if( L < root.val ){
            rangeSumBST(root.left, L,R);         
        }
        if(root.val < R){        
        rangeSumBST(root.right, L,R);
        }
        
        
        return sum;
    }
}