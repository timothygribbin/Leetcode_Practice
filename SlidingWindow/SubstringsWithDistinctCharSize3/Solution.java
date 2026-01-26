package SlidingWindow.SubstringsWithDistinctCharSize3;

import java.util.HashSet;

class Solution {
    public int countGoodSubstrings(String s) {
        // Intialize varibale to count good substrings
        int count = 0;
        
        // Iterate over each character treating it as the first in the substring
        for(int i = 0; i < s.length() - 3 + 1; i++) {
            // Initialize boolean variable, we will assume all substrings are valid until it is proven otherwise
            boolean isGood = true;
            // Hashset to hold the characters currently in the strings, for substrings of 3 I supposed this makes no real
            // performance difference
            HashSet<Character> set = new HashSet<>();
            // Go through each window of 3
            for(int j = 0; j < 3; j++) {
                // the current char
                char currentChar = s.charAt(i + j);
                // Check if the hashset contains the currentChar
                if(set.contains(currentChar)) {
                    // If it does, it's a duplicate and not a valid substring and we can just move on to the next window
                    isGood = false;
                    break;
                }
                // If the set doesn't contain the current char add it and check the next char in the potential substring 
                set.add(currentChar);
            }   
            
            // If we get to the end of the inner loop and it did not flag for invalid substring, add 1 to our count
            if(isGood) count++;
        }

        // Return the number of valid substrings
        return count;
    }
}