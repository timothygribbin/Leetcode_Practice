package Arrays.MinMaxSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
		int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        int[] result = findMinMaxSums(n, arr, k);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] findMinMaxSums(int n, int[] arr, int k) {

		// I know this is an inefficient solution, I know if we were to sort each array and then take the first k element/the last k elements it would be much quicker 
		// with O(nlogn) speed, but I wanted to do this approach first and then time got away from me.
		// To find the MIN SUM, we want to find the k smallest elements in the array, remove them and then sum the remaining elements

		// Find the k smallest elements and store them in an array of size k
		// Define an array list, easier to work with
		ArrayList<Integer> minArr = new ArrayList<Integer>();

		// Make one pass for each of the k min elements we must find
		for(int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
			// Pass through each element in the original array
			for(int j = 0; j < arr.length; j++) {

				// Varibale to hold the min value
                min = Integer.MAX_VALUE;
				// If the current element is less than the min and the minArray doesn't contain the current element

				if(arr[j] < min && !minArr.contains(arr[j])) {
					// Set the min to the current
					min = arr[j];
				}
			}
			// Add the min element to the list
			minArr.add(min);
		}
		// Sum the remiaining elements
		int minSum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(!minArr.contains(arr[i])) {
				minSum += arr[i];
			}
		}


		// To find the MAX SUM, we want to find the k largest elements in the array, remove them, and then sum the remiaining elements 

		ArrayList<Integer> maxArr = new ArrayList<Integer>();

		// Make one pass for each of the k max elements we must find
		for(int i = 0; i < k; i++) {
            int max = Integer.MIN_VALUE;
			// Pass through each element in the original array
			for(int j = 0; j < arr.length; j++) {

				// Varibale to hold the max value
				max = Integer.MAX_VALUE;
				// If the current element is less than the max and the maxArray doesn't contain the current element

				if(arr[j] > max && !maxArr.contains(arr[j])) {
					// Set the max to the current
					max = arr[j];
				}
			}
			// Add the max element to the list
			maxArr.add(max);
		}

		// Sum the remaining elements
		int maxSum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(!maxArr.contains(arr[i])) {
				maxSum += arr[i];
			}
		}

		return new int[] {maxSum, minSum};
    }

}
