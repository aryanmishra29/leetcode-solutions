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
    public int findBottomLeftValue(TreeNode root) {
        int height = height(root);
        return solve(root, height);
    }
    public Integer solve(TreeNode root, int height){
        if(root == null) return null;
        if(height == 1) return root.val;
        Integer l = solve(root.left, height-1);
        Integer r = solve(root.right, height -1);
        return l==null ? r : l;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l,r) + 1;
    }
}