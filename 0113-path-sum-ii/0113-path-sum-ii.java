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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>path = new ArrayList<>();
        helper(root,targetSum,path,res);
        return res;

    }
    void helper(TreeNode root, int sum,List<Integer>path,List<List<Integer>>res){
        if(root==null)return;
        path.add(root.val);
        if(root.left==null && root.right==null && root.val==sum){res.add(new ArrayList<>(path));}
        helper(root.left,sum-root.val,path,res);
        helper(root.right,sum-root.val,path,res);
        path.remove(path.size()-1);
    }
}
 