class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Check the base cases
        if(strs == null || strs.length == 0) return "";

        // Intialize the ending index as the entire string
        int end = strs[0].length();

        // Go through each string in the array (except the first one that we assume is the prefix to start)
        for(int i = 1; i < strs.length; i++) {
            
            // Take the smaller of the two between the end and the length of the current string 
            int limit = Math.min(end, strs[i].length());

            // Initialize the second loop variable
            int j = 0;

            // While j is < the limit and the characters match, increment j
            while(j < limit && strs[0].charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            // Make the end = j after each string, this sets as the new end of the prefix
            end = j; 
        }

        // Return the substring from the first string (technically could be any, but we are guaranteed to have 1 string due to our base case check above)
        return strs[0].substring(0, end);
    }
}
