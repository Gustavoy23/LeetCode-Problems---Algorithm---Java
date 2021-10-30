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
    int res=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
       

        int parent = -1;
        
        int left = dfs(root.left,root.val,0);
        int right = dfs(root.right, root.val, 0);
        int val= left +right;
      // System.out.println(left + " "+right);
        res = Math.max(res, val);
        
        longestUnivaluePath(root.left);
        longestUnivaluePath(root.right);
        
        return res;
    }
    
    
    private int dfs(TreeNode root, int parent, int count){
        if(root == null || parent !=  root.val) return 0;
        
        if(parent == root.val && root.left == null && root.right == null ){
          return 1;
        }
        
      
        parent = root.val;
        
        int left = dfs(root.left, parent, count+1);
        int right = dfs(root.right, parent, count+1);
        
       
        return Math.max(left,right)+1;
        
    }
}