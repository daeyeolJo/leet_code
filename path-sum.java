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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        return pathSum(root, 0, targetSum);
    }
    private boolean pathSum(TreeNode root, int currSum, int targetSum){
        currSum += root.val;
        if(root.left == null && root.right == null)
            return currSum == targetSum;
        else if(root.left != null && root.right != null)
            return pathSum(root.left, currSum, targetSum) || pathSum(root.right, currSum, targetSum);
        else if(root.right != null)
            return pathSum(root.right, currSum, targetSum);
        else
            return pathSum(root.left, currSum, targetSum);
    }
}
