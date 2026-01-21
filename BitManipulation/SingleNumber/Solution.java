class Solution {
    public int singleNumber(int[] nums) {

        // Answer that will hold the state (will explain more below)
        int ans = 0;

        // Answer will be xor'd with each number in the array
        for(int i = 0; i < nums.length; i++) {
            
            // If you ^ and the number has not already been seen, then it adds to the "state" of the number, if it has already been seen, it cancels out the other number
            ans ^= nums[i];
        }
        
        // The number that is seen once will not be seen again and thus will be the only one not cancelled out, so we can just return the number
        return ans;
    }
}

