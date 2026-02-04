package Stack.MinStack;

import java.util.Stack;

class MinStack {
    // Base stack and a stack to track the minimums
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor to initialize the stacks
    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    // Push method
    public void push(int val) {
        // Check if the stack is empty
        if(minStack.isEmpty()) {
            // Push any value onto the min stack
            minStack.push(val);
        }
        // If the stack is not empty, check if it's less than the previous minimum value by peeking the stack
        else{
            // If the value is less than or equal to the previous minimum, then we push it onto the min stack
            if(val <= minStack.peek()){
                minStack.push(val);
            }
        }

        // Push to the main stack
        stack.push(val);
    }
    
    public void pop() {
        // Pop from the main stack
        int i = stack.pop();
        
        // Check if that was the minimum value and pop from the min stack if it is
        if(minStack.peek() == i){
            minStack.pop();
        }
    }
    
    // Return the top value from the stack
    public int top() {
        return stack.peek();
    }   
    // Get the top value from the min stack
    public int getMin() {
        return minStack.peek();
    }
}
