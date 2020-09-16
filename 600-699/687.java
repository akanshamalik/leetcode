/**687. Longest Univalue Path

 Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.
The length of path between two nodes is represented by the number of edges between them.

Example 1:
Input:

              5
             / \
            4   5
           / \   \
          1   1   5
Output: 2
 */


class Solution {
    int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        luniVal(root);
        return ans;
    }
    public int luniVal(TreeNode root) {
        if (root == null) return 0;
        int left = luniVal(root.left);
        int right = luniVal(root.right);
        int rootL = 0, rootR = 0;
        if (root.left != null && root.left.val == root.val) {
            rootL += left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            rootR += right + 1;
        }
        ans = Math.max(ans, rootL + rootR);

        return Math.max(rootL, rootR);
    }
}
