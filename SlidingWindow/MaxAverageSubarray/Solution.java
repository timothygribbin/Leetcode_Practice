package SlidingWindow.MaxAverageSubarray;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Initialize a variable for the maxSum
        double sum = 0;

        // Go through the first window of length k
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Assume the maxSum = the first window
        double maxSum = sum;

        // Slide the window over each window
        for(int i = k; i < nums.length; i++) {
            // Every new window, the first number in the last window leaves and the element after the window joins
            // So we subtract the first element of the last window and add the new element that has entered the window
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        // Divide by window size at the end to get the maxAverage instead of the max sum
        return maxSum / k;
    }
}