class Solution {
    public int fib(int n) {
        // Two base cases
        if(n == 0) return 0;
        if(n == 1) return 1;

        // Sum the two previous to find the current
        return fib(n - 1) + fib(n - 2);
    }
}

