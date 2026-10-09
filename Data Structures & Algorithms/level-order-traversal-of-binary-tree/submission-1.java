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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> r = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty() && root != null){
            int qs = q.size();
            List<Integer> rr = new ArrayList<>();
            while(qs!=0){
                TreeNode rt = q.poll();
                if (rt.left !=null){q.offer(rt.left);}
                if (rt.right !=null){q.offer(rt.right);}
                rr.add(rt.val);
                qs--;
            }
            r.add(rr);
        }
        return r;
    }
}
