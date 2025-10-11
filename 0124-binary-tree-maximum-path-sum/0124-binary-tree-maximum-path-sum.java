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
class Solution {//dfs
    public int maxPathSum(TreeNode root) {
        int[] res = {root.val};
        help(root, res);
        return res[0];
    }

    private int help(TreeNode node, int[] res) {
        if (node == null) {
            return 0;
        }
        int leftSum = Math.max(0, help(node.left, res));
        int rightSum = Math.max(0, help(node.right, res));

        res[0] = Math.max(res[0], leftSum + rightSum + node.val);

        return Math.max(leftSum, rightSum) + node.val;
    }    
}