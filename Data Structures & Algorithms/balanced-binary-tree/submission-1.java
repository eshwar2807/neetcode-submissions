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

    public boolean isBalanced(TreeNode root) {
        return h(root) != -1 ;
    }
    private int h(TreeNode r){
        if (r == null) return 0;
        int hr = h(r.right);
        if(hr == -1) return -1;
        int hl = h(r.left);
        if(hl == -1) return -1;
        if(Math.abs(hr-hl)>1) return -1;

        return 1+Math.max(hr,hl);

    }
}
