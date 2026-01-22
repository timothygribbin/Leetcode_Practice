public class Solution {
    public int[] plusOne(int[] digits) {
        // Go through each digit
        for(int i = digits.length - 1; i >= 0; i--) {
            // If the digit is not 9, then we just add 1 and end the loop
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If it is 9, then we set it to 0 and go to the next one
            digits[i] = 0;
        }

        // Once we hit a 9 we hit a non 9 it returns, so if we're here there are all nines
        int[] result = new int[digits.length + 1];
        // Convert them all to 0's
        result[0] = 1;
        // return result
        return result;
    }
}
