import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        // If k = 1, the window will be 1, so we can just return 0 because any nums[i] - nums[i] = 0
        if(k == 1) return 0;

        // Sort the array
        Arrays.sort(nums);

        // Minimum value intialized to largest possible integer
        int minimum = Integer.MAX_VALUE;

        // Go through each i
        for(int i = 0; i < nums.length - k + 1; i++) {
            // Set the minimum to the difference between the last element in the window and the first
            minimum = Math.min(nums[i + k - 1] - nums[i], minimum);
        }
        
        // Return the minimum value
        return minimum;
    }
}
