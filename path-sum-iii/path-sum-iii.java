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
List<Integer> list;
    public int pathSum(TreeNode root, int targetSum) {
        res = 0;
        list = new ArrayList<>();
        
        dfs(root, list, targetSum);
        return res;
    }
    
    private void dfs(TreeNode root, List<Integer> list, int target) {
        if(root == null) return;
        
        list.add(root.val);
        
  
        dfs(root.left, list, target);
        dfs(root.right, list, target);
        
        int sum = 0;
        for(int i = list.size() - 1; i>=0; i--){
            sum+= list.get(i);
            if(sum==target) res++;
        }
        
        list.remove(list.size()-1);
    
    }
}