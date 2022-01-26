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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        List<Integer> list1 = new ArrayList<>();
        inorder(root1, list1);
        
        List<Integer> list2 = new ArrayList<>();
        inorder(root2, list2);
        
        return merge(list1, list2);
        
    }
    
    public List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> res = new ArrayList<>();
        
        int i1 = 0;
        int i2 = 0;
        while(i1 < list1.size() && i2 < list2.size()) {
            if(list1.get(i1) < list2.get(i2)){
                res.add(list1.get(i1));
                i1++;
            } else{
                res.add(list2.get(i2));
                i2++;
            }
        }
        
        if(i1 < list1.size()) {
            while(i1 < list1.size()) {
                res.add(list1.get(i1));
                i1++;
            }
        }
        
        if(i2 < list2.size()) {
            while(i2 < list2.size()) {
                res.add(list2.get(i2));
                i2++;
            }
        }
    return res;
    }
    
    public void inorder(TreeNode root, List<Integer> list) {
        if(root== null) return;
        
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right, list);
        
    }
}