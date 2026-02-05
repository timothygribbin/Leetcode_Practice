package TwoPointers.BinarySearch;

class Solution {
    public int search(int[] nums, int target) {
        // Two pointers, one starts at the first index and the other starts at the last index
        int left = 0;
        int right = nums.length - 1;

        // While left <= right
        while(left <= right) {
            // Calculate the mid point between the right and left pointers
            int middle = left + (right - left) / 2;

            // If the middle number is < the target, then we know it cannot be in the first half of the array
            if(nums[middle] < target) {
                left = middle + 1;
            }
            // If the middle number is > the target, we know it cannot be in the second half of the array
            else if(nums[middle] > target) {
                right = middle - 1;
            }
            // If the middle number is = to the target, we have found it and can return the index
            else {
                return middle;
            }
        }

        // If we go through the entire array and didn't find it, our value is not in the array, so we return -1
        return -1;
    }
}
