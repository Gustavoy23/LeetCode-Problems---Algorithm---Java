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
    int sum;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        String sb = "";
        dfs(root,  sb);
        return sum;
        
    }
    
    private void dfs(TreeNode root, String sb) {
        if(root==null) return ;
        
        sb += root.val;
        
        if(root.left == null && root.right == null) {
           // System.out.println(sb);
            sum+=Integer.parseInt(sb);
        }
        dfs(root.left, sb);
        dfs(root.right, sb);
        
        
    }
}