import java.util.Stack;
/**
 * Apparently Stack is no longer supported by Java? Didn't know this and I learned stack in my DSA class, maybe will change to the recommended Deque later on but this works for now
 */
class Solution {
    public boolean isValid(String s) {

        // Stack holds the open parentheses
        Stack<Character> stack = new Stack<>();

        // Go through each letter in the string
        for(int i = 0; i < s.length(); i++) {

            // Get the char at i
            Character currentChar = s.charAt(i);

            // If the currentChar is an open bracket, push it to the stack
            if(currentChar == '{' || currentChar == '(' || currentChar == '[') {
                stack.push(currentChar);
            }

            // If the currentChar is a close bracket, pop from the stack and be sure that the top element is the corresponding
            if(currentChar == '}' || currentChar == ')' || currentChar == ']') {

                // Call the helper and if they don't match return false;
                if(!match(currentChar, stack.pop())) {
                    return false;
                }
            }
        }

        // Return true if the list is empty and false if it isn't
        return stack.size() == 0;
    }

    // Helper to make sure it's the correct one
    public boolean match(Character c, Character d) {

        // Just matches the close bracket to the open bracker
        if((c == '}' && d != '{') || (c == ')' && d != '(') || (c == ']' && d != '[')) {
            return false;
        }
        return true;
    }
}
