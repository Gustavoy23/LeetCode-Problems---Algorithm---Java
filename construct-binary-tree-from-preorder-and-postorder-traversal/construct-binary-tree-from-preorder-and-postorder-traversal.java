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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        int n = pre.length;
        return dfs(pre,post, 0, n -1, 0, n -1 );
        
    }
    
    private TreeNode dfs(int[] pre, int[] post, int preStart, int preEnd, int postStart, int postEnd) {
       if(preEnd < preStart) return null;
         TreeNode root = new TreeNode(pre[preStart]);
        
        if(preStart == preEnd) {
            return root;
        }
        
        int postIndex = postStart;
        while(post[postIndex] != pre[preStart+1]) postIndex++;
        
        int len = postIndex - postStart + 1;
        root.left = dfs(pre, post, preStart+1, preStart+len, postStart, postIndex);
        root.right = dfs(pre, post, preStart+len+1, preEnd, postIndex +1, postEnd-1);
        return root;
    }
}