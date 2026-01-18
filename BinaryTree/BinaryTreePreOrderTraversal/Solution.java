package BinaryTree.BinaryTreePreOrderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * TESTED ON LEETCODE DIRECTLY
 */

public class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            // Initialize list to hold traversal order
            List<Integer> list = new ArrayList<>();

            // Call the recursive method to traverse, we are passing the list by reference, so we can directly modify it and return the list after
            preorderTraversalRecursive(root, list);
            return list;   
        }

        public void preorderTraversalRecursive(TreeNode root, List<Integer> list) {
            // Base case, if the root is null return
            if(root == null) return;

            // Add the root to the list first
            list.add(root.val);

            // Then call on the left node as the root
            preorderTraversalRecursive(root.left, list);

            /// Then call on the right node as the root
            preorderTraversalRecursive(root.right, list);
        }
}