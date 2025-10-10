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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        boolean rev = false;//false-> left to right; true-> right to left
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        while(!dq.isEmpty()){
            int size = dq.size();
            List<Integer>ans = new ArrayList<>();
            for(int i=0;i<size;i++){

                if(!rev){
                    TreeNode curr = dq.pollFirst();
                    ans.add(curr.val);
                    if(curr.left!=null) dq.offerLast(curr.left);
                    if(curr.right!=null) dq.offerLast(curr.right);

                }
                else{
                    TreeNode curr = dq.pollLast();
                    ans.add(curr.val);
                    if(curr.right!=null) dq.offerFirst(curr.right);
                    if(curr.left!=null) dq.offerFirst(curr.left);
                }

            }
                rev=!rev;

            res.add(ans);

        }
        return res;


//Queue


        // List<List<Integer>> result = new ArrayList<>();
        // if (root == null) return result;

        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);
        // boolean f = false;

        // while (!queue.isEmpty()) {
        //     int size = queue.size();
        //     List<Integer> list = new ArrayList<>();

        //     for (int i = 0; i < size; i++) {
        //         TreeNode temp = queue.poll();
        //         if (temp != null) {
        //             list.add(temp.val);
        //             if (temp.left != null) queue.add(temp.left);
        //             if (temp.right != null) queue.add(temp.right);
        //         }
        //     }

        //     if(f) {
        //         Collections.reverse(list);
        //     }
        //     result.add(list);
        //     f = !f;
        // }

        // return result;



        // List<List<Integer>> res=new ArrayList<>();
        // if(root == null)return res;
        // Queue<TreeNode> q=new LinkedList<>();
        // boolean f=false;
        // q.add(root);
        // while(!q.isEmpty()){
        //     int s=q.size();
        //     List<Integer> l=new ArrayList<>();

        //     for(int i=0;i<s;i++){
        //         TreeNode t=q.poll();
        //         l.add(t.val);
        //         if(t.left!=null) q.add(t.left);
        //         if(t.right!=null) q.add(t.right);


        //     }
        //     if(f){
        //         Collections.reverse(l);
        //     }
        //     res.add(l);
        //     f=!f;
        // }
        // return res;

    }
}