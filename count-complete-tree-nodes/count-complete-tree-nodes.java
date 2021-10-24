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
    int count;
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        count = 0;
        dfs(root);
        return count;
        
        
        
    }
    
    private void dfs(TreeNode root){
        if(root == null) return;
        
        count++;
        dfs(root.left);
        dfs(root.right);
    }
}