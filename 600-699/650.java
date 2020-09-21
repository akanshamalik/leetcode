/**654. Maximum Binary Tree

 Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
1. The root is the maximum number in the array.
2. The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
3. The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    / 
     2  0   
       \
        1
 */

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null){
            return null;
        }
        return helper(nums, 0, nums.length);
    }
    public TreeNode helper(int[] nums, int L, int R){
        if(L == R){
            return null;
        }
        int max = L;
        for(int i =L; i<R; i++){
            if(nums[max] < nums[i]){
                max = i;
            }
        }
        TreeNode root = new TreeNode(nums[max]);
        root.left = helper(nums, L, max);
        root.right = helper(nums, max+1, R);
        
        return root;
        
    }
}
