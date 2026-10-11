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
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> s = new ArrayDeque<>();
        int count = 0;
        TreeNode c = root;
        while(c!=null || !s.isEmpty()){
        while(c!=null){
                s.push(c);
                c = c.left;
        }
        c = s.pop();
        count++;
        if(count == k) {return c.val;}
        c = c.right;
    }
        return -1;
    }
}
