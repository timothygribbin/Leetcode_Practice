package HashTable.ReturnTheMajorityElement;

import java.util.HashMap;

/**
 * TESTED ON LEETCODE DIRECTLY
 */

class Solution {
    public int majorityElement(int[] nums) {
        // If nums.length = 1, just return the first and only element
        if(nums.length == 1) return nums[0];

        // If nums.length >= 2, build this map
        HashMap<Integer, Integer> map = new HashMap<>();

        // Go through each entry in the nums array
        for(int i = 0; i < nums.length; i++) {
            
            // Check the currentCount
            Integer currentCount = map.get(nums[i]);

            // If the current count exists
            if(currentCount != null){

                // Update the entry in the map to have one more count
                map.put(nums[i], ++currentCount);

                // Check if it's the majority element for every update
                if(currentCount > (nums.length / 2)){
                    return nums[i];
                }
            }

            // If it doesn't exist, add it to the map with count  
            else {
                map.put(nums[i], 1);
            }

        }

        // Will never reach this case because we are guaranteed a majority element
        return 0;
    }
}