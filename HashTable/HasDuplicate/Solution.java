package HashTable.HasDuplicate;

import java.util.HashSet;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Define a HashSet to hold the numbers
        HashSet<Integer> set = new HashSet<>(); 
        
        // Go through each numbers
        for(int i = 0; i < nums.length; i++) {
            // If the set contains the number already, we have a duplicate
            if(set.contains(nums[i])) {
                return true;
            }
            // If it isn't already in the set, add it 
            set.add(nums[i]);
        }

        // Return false if we go through the entire array without seeing a duplicate
        return false;
    }
}