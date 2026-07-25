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
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> r = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> ra = new ArrayList<>();
            for(int i = 0; i<s; i++ ){
                TreeNode t = q.poll();
                ra.add(t.val);
                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
                
            }
            r.add(ra);
        }
        return r;
    }
}
