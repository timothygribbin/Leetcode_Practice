package HashTable.ContainsDuplicate;

import java.util.HashSet;

/**
 * TESTED ON LEETCODE DIRECTLY
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {

        // If there is one element it is always distinct
        if(nums.length == 1) return false;

        // If there is more than one element, we build the set
        HashSet<Integer> set = new HashSet<>();

        // Check each element in the array, and add it to the set for O(1) (checking contains)
        for(int i = 0; i < nums.length; i++) {

            // If it's not in the set already add it
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            }

            // If it's already in the set then it's a duplicate
            else { 
                return true;
            }
        }

        // If we go through every element without a duplicate there are no duplicates
        return false;
    }
}