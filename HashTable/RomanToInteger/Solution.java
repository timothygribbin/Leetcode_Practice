package HashTable.RomanToInteger;

import java.util.Hashtable;
/**
 * TESTED ON LEETCODE DIRECTLY
 */
public class Solution {
    public int romanToInt(String s) {
        // Initialize Hashtbale with known roman numeral variables
        Hashtable<Character, Integer> table = new Hashtable<>();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);

        // Initialize sum value
        int sum = 0;

        // Go through each character in s
        for(int i = 0; i < s.length() - 1; i++) {
            // Get the relevant values
            int value = table.get(s.charAt(i));
            int nextValue = table.get(s.charAt(i + 1));

            // If the current value >= nextValue, add the value
            if(value >= nextValue) { 
                sum += value;
            }  
            // If the current value < nextValue, we subtract the value, because we will subtract and then eventually add the full value it is subtracting from 
            // So if it's 'VL' we'll get sum = sum 0-5, then sum = sum + 50, for a net add of 45, which is what that sequence represents
            else {
                sum -= value;
            }
        }

        // Always add the last character of the string and return
        return sum + table.get(s.charAt(s.length() - 1));
    }
}
