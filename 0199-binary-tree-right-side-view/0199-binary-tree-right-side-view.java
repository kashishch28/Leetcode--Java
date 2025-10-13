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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>li = new ArrayList<>();
        if(root==null) return li;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=  q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(i==size-1){                //checks if the curr node of the current level is last(rightmost node) of the tree
                    li.add(temp.val);
                }
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }

           
        }
        return li;















        // List<Integer>li = new ArrayList<>();
        // if(root==null) return li;
        // Queue<TreeNode>q = new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     int size=  q.size();
        //     TreeNode r = null;
        //     for(int i=0;i<size;i++){
        //         TreeNode temp = q.poll();
        //         r = temp;

        //         if(temp.left!=null)q.add(temp.left);
        //         if(temp.right!=null)q.add(temp.right);
        //     }

        //     if(r!=null) li.add(r.val);
        // }
        // return li;
    }
}