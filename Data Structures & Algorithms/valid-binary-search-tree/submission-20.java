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
    public boolean isValidBST(TreeNode root) {
        return v(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean v(TreeNode node, long l, long r){
            if(node == null){
                return true;
            }
            if (!(l < node.val && node.val < r)){
                return false;
            }
            return v(node.left,l,node.val) && v(node.right,node.val,r);
        }
}
