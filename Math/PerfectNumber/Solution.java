class Solution {
    public boolean checkPerfectNumber(int num) {
        // Variable for the sum
        int sum = 0;
        // Start from half of num and move downwards
        int divisor = num / 2;
        while(divisor > 0){
            // Check if the num is divided by the divisor
            if(num % divisor == 0) {
                // Add the divisor to the sum if if it divided by it
                sum += divisor;
            }
            // Decrement the divisor
            divisor--;
        }
        // Check if the sum == num and return the boolean result
        return sum == num;
    }
}