import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        // Check each value in the array
        for(int i = 0; i < nums.length; i++) {
            // If the current value doesn't equal i, then return i, because it is not in it
            if(nums[i] != i) {
                return i;
            }
        }
        // Else return the length of the array (because the missing value is the one that did not fit)
        return nums.length;
    }
}
