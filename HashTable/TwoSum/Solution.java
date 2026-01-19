import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Define a hashmap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Build the map and check for complement
        for(int i = 0; i < nums.length; i++) {
            // The complement is the number that would need to be in the map for it to sum to the target
            int complement = target - nums[i];

            // If the map has the complement in there already, then we have found the two numbers that sum to the target
            if(map.containsKey(complement)) {
                // Return these two indeces
                return new int [] {map.get(complement), i};
            }

            // Add it if it's not already on there
            map.put(nums[i], i);
        }

        // If it makes it to the end then there is no pair, so return an empty array, but we'd never reach this case
        return new int [] {};
    }
}
