package BinaryTree.SortedArrayToBST;

/**
 * TESTED ON LEETCODE DIRECTLY
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Check if it's size 1 and return just the 1st element as a TreeNode if so
        if(nums.length == 1) return new TreeNode(nums[0]);
        
        // Return the root node from the tree build, the left is 0 and the right is the right side
        return build(nums, 0, nums.length - 1);

    }

    public TreeNode build(int[] nums, int left, int right) {
        // If left > right, then we have gone through the whole array and we can return null
        if(left > right) return null;

        // Calculate the mid point of the current subarray we are working with
        int mid = left + (right - left) / 2;

        // Build a tree node out of the current mid element
        TreeNode middle = new TreeNode(nums[mid]);

        // Get the left sub tree by recursively calling build, this will move the right pointer towards the left until left > right
        middle.left = build(nums, left, mid - 1);

        // Get the right sub tree by recursively calling build, this will move the left pointer towards the right until left > right
        middle.right = build(nums, mid + 1, right);
        
        // Return the middle node
        return middle;
    }
}

