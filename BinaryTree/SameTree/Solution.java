class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        // This is the base case, if they are both null, we have reached the end of the trees and it has not been flagged yet
        // so we return true
        if(p == null && q == null) return true;


        // If one is null and not the other, then they are not equal so return false
        // We write it this way because we cannot access the val if it is a null node
        if(p == null ^ q == null) return false;

        // If the values don't match return false
        if(p.val != q.val) return false;

        // return the true if both subtrees equal each other, false if not
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}