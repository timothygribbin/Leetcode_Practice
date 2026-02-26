package String.countPalindromeSubstrings;

class Solution {
    public int countSubstrings(String s) {
        // Variable for total number of palindromes
        int total = 0;
        // Go through each center
        for(int i = 0; i < s.length(); i++) {
            // Add the odd length ones
            total += expandCenter(s, i, i);
            // Add the even length ones
            total += expandCenter(s, i, i + 1);
        }
        
        // Return the total
        return total;
    }

    public int expandCenter(String s, int left, int right) {
        // Counts total
        int total = 0;
        
        // Check we are not out of bounds, and that we have two equal chars
        while(left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
            // Every time this loop does not break, we have found another palindrome
            total++;
            // Move the pointers
            left--;
            right++;
        }
        // Return the total after we break
        return total;
    }
}