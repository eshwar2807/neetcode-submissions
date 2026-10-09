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
    
    public int maxDepth(TreeNode root) {
        int lc = 0;
        int rc = 0;
        if (root != null){
        
            
            lc = maxDepth(root.left)+1;
       
           
           rc = maxDepth(root.right)+1;
        } else {return 0;}
        return Math.max(lc,rc);
    }
}
