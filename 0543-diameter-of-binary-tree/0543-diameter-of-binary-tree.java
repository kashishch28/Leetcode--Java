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
class Solution {
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        // int dia=0;
        height(root);
        return dia;
    }
        public int height(TreeNode root){
            // int dia=0;
            if(root==null) return 0;
            int left = height(root.left);
            int right = height(root.right);
            int curr = left+right;
            dia = Math.max(dia,curr);  //update dia
            return Math.max(left,right)+1;    //return depth
        }
    }
