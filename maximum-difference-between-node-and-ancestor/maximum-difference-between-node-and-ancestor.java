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
    
    int res;
    public int maxAncestorDiff(TreeNode root) {
        int maxV = 0;
        int minV = Integer.MAX_VALUE;
        res =0;
        dfs(root, minV, maxV,0);
        return res;
    }
    
    private void dfs(TreeNode root, int minV, int maxV, int level) {
        if(root==null) return;
        
        if(level!=0) {
            res = Math.max(Math.abs(minV-root.val), res);
            res = Math.max(Math.abs(maxV-root.val), res);
        }
        
        minV=Math.min(minV, root.val);
        maxV = Math.max(maxV, root.val);
        
        dfs(root.left, minV, maxV, level+1);
        dfs(root.right, minV, maxV, level+1);
    }
}