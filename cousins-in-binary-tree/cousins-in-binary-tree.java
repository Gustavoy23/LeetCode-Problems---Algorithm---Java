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
    int[] xinfo;
    int[] yinfo;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
       
        xinfo = new int[2];
        yinfo = new int[2];
        TreeNode parent = null;
        int level = 0;
        dfs(root, x, y,parent, level);
        
        if(xinfo[0]!=yinfo[0] && xinfo[1]==yinfo[1])return true;
        else return false;
        
    }
    
    private void dfs(TreeNode root, int x, int y, TreeNode parent, int level) {
        
        if(root == null) return;
        
        if(x == root.val && parent!=null){
            xinfo[0] = parent.val;
            xinfo[1] = level;
        }
        
        if(y == root.val && parent!= null){
            yinfo[0] = parent.val;
            yinfo[1] = level;
        }
        
        parent = root;
        
        dfs(root.left, x, y, parent, level+1);
        dfs(root.right, x, y, parent, level+1); 
                
    }
}