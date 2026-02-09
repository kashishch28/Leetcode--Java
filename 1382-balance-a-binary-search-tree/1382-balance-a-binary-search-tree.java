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
    public void inorder(TreeNode node,List<Integer>ls){
        if(node==null)return;
        inorder(node.left,ls);
        ls.add(node.val);
        inorder(node.right,ls);
    }
    public TreeNode bal(List<Integer>ls,int l,int r){
        if(l>r)return null;
        int mid = (l+r)/2;
        TreeNode node = new TreeNode(ls.get(mid));
        node.left = bal(ls,l,mid-1);
        node.right = bal(ls,mid+1,r);
        return node;
    }

    public TreeNode balanceBST(TreeNode root) {
        List<Integer>ls = new ArrayList<>();
        inorder(root,ls);
        return bal(ls,0,ls.size()-1);
    }
}