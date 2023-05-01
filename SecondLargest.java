package arrays.easy;
/**
 * Problem Statement: Given an array, find the second largest element in the array. 
 * Print ‘-1’ in the event that either of them doesn’t exist.
 * 
 * Solution :
 * We can sort an array and can return second last element of a sorted array . But Time Complexity is O(n^2) and doesn't work if arrays has
 * duplicates.
 * 
 * The better solution is find the largest element in a array by traversing the array and traverse once again find an element which is just greater
 * than the largest element we just found.
 * 
 * The best solution is maintain 2 variables. one is max and other is secondMax and update variables accordingly while traversing the array.
 *
 */
public class SecondLargest {

	public static int secondLargest(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];				
			} if(arr[i] < max && arr[i]>secMax)
				secMax = arr[i];
			
		}
		
		if(secMax == Integer.MIN_VALUE)
			return -1;
		return secMax;
	}
	
	public static void main(String args[]) {
		int[] arr = {2,2,2,2,2,2};
		System.out.println(secondLargest(arr));
	}
}
