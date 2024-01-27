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
    public boolean isSym(TreeNode left_root, TreeNode right_root){
        boolean all_null1 = false;
        boolean all_null2 = false;
        if(left_root.val != right_root.val)
            return false;

        if(left_root.left != null && right_root.right != null) {
            if(left_root.left.val != right_root.right.val){
                return false;
            } 
        } 
        else if(left_root.left != null || right_root.right != null)
            return false;
        else
            all_null1 = true;

        if(left_root.right != null && right_root.left != null){
            if(left_root.right.val != right_root.left.val){
                return false;
            }
        } 
        else if(left_root.right != null || right_root.left != null)
            return false;
        else
            all_null2 = true;
        
        if(all_null1 && all_null2)
            return true;
        else if(all_null1)
            return isSym(left_root.right, right_root.left);
        else if(all_null2)
            return isSym(left_root.left, right_root.right);
        else
            return isSym(left_root.left, right_root.right) && isSym(left_root.right, right_root.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        else if(root.left == null || root.right == null)
            return false;
        else
            return isSym(root.left, root.right);
    }
}
