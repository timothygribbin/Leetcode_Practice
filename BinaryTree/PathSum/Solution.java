package BinaryTree.PathSum;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        // This only happens if the entire tree is empty

        if(root == null) return false;
        /* The base case is a leaf node, if we're at a leetcode, we return the truth value of targetSum = root.val
        because we have subtracted all the other values we have already seen, it will be the target if we only have
        the value left in target in our root, then we have found a root to leaf path that adds to the target sum */

        if(root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        
        // Variable to hold the target - root.val
        int currentTarget = targetSum - root.val;


        // Return true if either of the paths (left or right) return true
        return hasPathSum(root.left, currentTarget) || hasPathSum(root.right, currentTarget);
    }
}
