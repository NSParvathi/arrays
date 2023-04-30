package sortings;

/*
 * Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.
 */
import java.util.Arrays;

public class BubbleSort {
	
	/*
	 * Bubble sort means we swap the adjacent elements until they are sorted. Below are the steps to be followed
	 * 1. First, we will select the range of the unsorted array by running a loop(say i) that will signify the last index of the selected range.
	 *  The loop will run backward from index n-1 to 0(where n = size of the array). The value i = n-1 means the range is from 0 to n-1, 
	 *  and similarly, i = n-2 means the range is from 0 to n-2, and so on.
	 * 2. Within the loop, we will run another loop(say j, runs from 0 to i-1 though the range is from 0 to i) to push the maximum element to the
	 *  last index of the selected range, by repeatedly swapping adjacent elements.
	 * 3. Basically, we will swap adjacent elements(if arr[j] > arr[j+1]) until the maximum element of the range reaches the end.
	 * 4. After each iteration, the last part of the array will become sorted. For example, after the first iteration, 
	 *	the array up to the last index will be sorted, and after the second iteration, the array up to the second last index will be sorted, 
	 *	and so on.
	 *	After (n-1) iteration, the whole array will be sorted.
	 *
	 *	Time Complexity  : O(n^2)
	 */
	public static void bubbleSort(int[] arr) {
		
		int n = arr.length;
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		int[] arr = {2,7,9,4,3,1,6,5};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

