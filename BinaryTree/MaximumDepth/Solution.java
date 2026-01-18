package BinaryTree.MaximumDepth;

class Solution {
    public int maxDepth(TreeNode root) {
        // Base case, if the root is null we return 0
        if(root == null) return 0;

        // Recursively explore each sub tree, add 1 for the current node, and then add the sum of the subtree. 
        // We use DFS because BFS would require visiting each node and an extra queue
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
