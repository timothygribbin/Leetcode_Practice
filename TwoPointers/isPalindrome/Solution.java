package TwoPointers.isPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        // Set the string to is lowercase
        String lower = s.toLowerCase();
        // Define two pointers, one at the beginning, one at the end
        int left = 0;
        int right = s.length() - 1;
        // While the left pointer is less than the right pointer
        while(left < right) {
            // Get the characters at the respective positions
            char leftChar = lower.charAt(left);
            char rightChar = lower.charAt(right);

            // Check if the chars are alphanumeric
            // We must "continue" after incrementing/decrementing one of these or we risk an infinite loop
            if(!Character.isLetterOrDigit(leftChar)){ 
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(rightChar)){ 
                right--;
                continue;
            }

            // Once we find the alphanumeric chars on either side, compare them
            // If they are not the same, return false;
            if(leftChar != rightChar) {
                return false;
            }
            // Increment and decrement because we will at least have to do this
            // Let the if statements above handle finding the alphanumeric char
            // Let these handle the base increment/decrement
            left++;
            right--;
        }

        // If we get through the loop with no chars not equaling each other, it is a palindrome
        return true;
    }
}
