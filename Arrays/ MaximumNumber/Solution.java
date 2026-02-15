class Solution {
    public int maxSubArray(int[] nums) {
        // Variable to hold the current sum
        int currentSum = 0;

        // Variable to hold the maxSum, we set to the lowest possible integer variable
        int maxSum = Integer.MIN_VALUE;

        // Go through each element in the array
        for(int i = 0; i < nums.length; i++) {
            // If the current sum is negative, then set the current sum to 0. 
            // The negative values will never help us with the largest possible sum
            if(currentSum < 0) {
                currentSum = 0;
            }

            // Add the current value to the current sum
            currentSum += nums[i];

            // Check if the max sum is less than the current sum
            // If it is we have a new max sum
            if(maxSum < currentSum){
                maxSum = currentSum;
            }
        }
        
        // Return the max sum that we found
        return maxSum;
    }
}